package 1;

import org.linkki.framework.ui.application.LinkkiUi;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;

import 1.view.MainView;

@Theme("testing")
@Widgetset("com.vaadin.v7.Vaadin7WidgetSet")
public class devopsUI extends LinkkiUi implements ViewDisplay {

    private static final long serialVersionUID = 1L;

    public devopsUI() {
        super(new devopsApplicationConfig());
    }

    @Override
    protected void init(VaadinRequest request) {
        super.init(request);
        addView(MainView.NAME, MainView.class);
    }

    @Override
    public void showView(View view) {
        getApplicationLayout().showView(view);
    }

}
