package 1.page;

import org.linkki.core.binding.manager.BindingManager;
import org.linkki.core.binding.manager.DefaultBindingManager;
import org.linkki.core.vaadin.component.page.AbstractPage;
import org.linkki.framework.ui.dialogs.ConfirmationDialog;
import org.linkki.util.handler.Handler;

import 1.pmo.HelloPmo;

public class devopsPage extends AbstractPage {

    private static final long serialVersionUID = 1L;

    private BindingManager bindingManager = new DefaultBindingManager();
    private HelloPmo helloPmo;

    public devopsPage() {
        this.helloPmo = new HelloPmo(() -> createOwnDialog());
    }

    @Override
    public void createContent() {
        addSection(helloPmo);
    }

    @Override
    public BindingManager getBindingManager() {
        return bindingManager;
    }

    public void createOwnDialog() {
        Handler handler = Handler.NOP_HANDLER;
        ConfirmationDialog dialog = new ConfirmationDialog("Now try to create your own linkki Web Application!", handler);
        dialog.setWidth("40em");
        dialog.open();
    }

}