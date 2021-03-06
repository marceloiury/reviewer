package br.ufpe.cin.reviewer.ui.rcp;

import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import br.ufpe.cin.reviewer.ui.rcp.literaturereview.LiteratureReviewPerspective;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return LiteratureReviewPerspective.ID;
	}
	
	public boolean preShutdown() {
		IPerspectiveRegistry perspectiveRegistry = PlatformUI.getWorkbench().getPerspectiveRegistry();
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		activePage.setPerspective(perspectiveRegistry.findPerspectiveWithId(LiteratureReviewPerspective.ID));
		
		return super.preShutdown();
	}
}
