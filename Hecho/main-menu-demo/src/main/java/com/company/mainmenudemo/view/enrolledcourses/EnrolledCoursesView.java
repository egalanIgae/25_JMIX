package com.company.mainmenudemo.view.enrolledcourses;


import com.company.mainmenudemo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "enrolled-courses-view", layout = MainView.class)
@ViewController(id = "EnrolledCoursesView")
@ViewDescriptor(path = "enrolled-courses-view.xml")
public class EnrolledCoursesView extends StandardView {
}