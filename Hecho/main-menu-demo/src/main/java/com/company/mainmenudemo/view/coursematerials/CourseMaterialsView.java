package com.company.mainmenudemo.view.coursematerials;


import com.company.mainmenudemo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "course-materials-view", layout = MainView.class)
@ViewController(id = "CourseMaterialsView")
@ViewDescriptor(path = "course-materials-view.xml")
public class CourseMaterialsView extends StandardView {
}