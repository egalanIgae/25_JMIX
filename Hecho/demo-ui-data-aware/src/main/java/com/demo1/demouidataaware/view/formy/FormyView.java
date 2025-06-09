package com.demo1.demouidataaware.view.formy;


import com.demo1.demouidataaware.entity.Formy;
import com.demo1.demouidataaware.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "formy-view", layout = MainView.class)
@ViewController(id = "FormyView")
@ViewDescriptor(path = "formy-view.xml")
public class FormyView extends StandardView {
    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private InstanceContainer<Formy> formyDc;

    @Subscribe
    public void onInit(final InitEvent event) {
        Formy formy = dataManager.create(Formy.class);
        formyDc.setItem(formy);
    }

    @Subscribe(id = "sendButton", subject = "clickListener")
    public void onSendButtonClick(final ClickEvent<JmixButton> event) {
        dataManager.save(formyDc.getItem());
    }

}