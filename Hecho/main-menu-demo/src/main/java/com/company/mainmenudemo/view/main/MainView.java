package com.company.mainmenudemo.view.main;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.app.main.StandardMainView;
import io.jmix.flowui.component.main.JmixListMenu;
import io.jmix.flowui.kit.component.main.ListMenu;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route("")
@ViewController(id = "MainView")
@ViewDescriptor(path = "main-view.xml")
public class MainView extends StandardMainView {

    @Autowired
    private UiComponents uiComponents;
    @ViewComponent
    private JmixListMenu menu;

    @Subscribe
    public void onInit(final InitEvent event) {
        Span badge = uiComponents.create(Span.class);
        badge.setText("nuevos");
        badge.getElement().getThemeList().add("badge pill small");

        ListMenu.MenuItem forumsItem = menu.getMenuItem("discussion-forums");

        if(forumsItem != null) {
            forumsItem.setSuffixComponent(badge);
        }
    }

}
