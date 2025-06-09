package com.company.mainmenudemo.view.courses;


import com.company.mainmenudemo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "courses-view", layout = MainView.class)
@ViewController(id = "CoursesView")
@ViewDescriptor(path = "courses-view.xml")
public class CoursesView extends StandardView {
}