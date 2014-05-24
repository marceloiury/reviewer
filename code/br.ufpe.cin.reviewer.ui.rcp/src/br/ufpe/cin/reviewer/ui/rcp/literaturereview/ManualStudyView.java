package br.ufpe.cin.reviewer.ui.rcp.literaturereview;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.ViewPart;

import br.ufpe.cin.reviewer.ui.rcp.common.BaseView;
import br.ufpe.cin.reviewer.ui.rcp.common.ReviewerViewRegister;
import br.ufpe.cin.reviewer.ui.rcp.common.UIConstants;
import br.ufpe.cin.reviewer.ui.rcp.literaturereview.StudyAnalysisView.BackButtonHandler;
import br.ufpe.cin.reviewer.ui.rcp.literaturereview.StudyAnalysisView.ExcludeButtonHandler;
import br.ufpe.cin.reviewer.ui.rcp.literaturereview.StudyAnalysisView.SkipButtonHandler;

public class ManualStudyView extends BaseView {

	public static final String ID = "br.ufpe.cin.reviewer.ui.rcp.literaturereview.StudyAnalysisView";

	private Section section;
	private Composite infoComposite;
	
	public ManualStudyView() {
		ReviewerViewRegister.putView(ID, this);
	}
	
	public void createPartControlImpl(Composite parent) {
		configureView(parent);
		createStudyWidgets(parent);
	}
	
	private void configureView(Composite parent) {
		super.form.setText(super.form.getText() + " - Manual Study");
		form.getBody().setLayout(new GridLayout(2, false));
	}
	
	private void createStudyWidgets(Composite parent) {
	    section = toolkit.createSection(form.getBody(), Section.TITLE_BAR);
	    section.setText("Info");
	    section.setLayout(new GridLayout(1, false));
		section.setLayoutData(new GridData(GridData.FILL_BOTH));

		infoComposite = toolkit.createComposite(section);
		infoComposite.setLayout(new GridLayout(1, false));
		infoComposite.setLayoutData(new GridData());
		
		section.setClient(infoComposite);
	}

	public void setFocus() {
		
	}

}