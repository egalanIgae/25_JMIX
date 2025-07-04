package com.company.proyectouno.view.course;

import com.company.proyectouno.entity.Course;
import com.company.proyectouno.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "courses", layout = MainView.class)
@ViewController(id = "Course.list")
@ViewDescriptor(path = "course-list-view.xml")
@LookupComponent("coursesDataGrid")
@DialogMode(width = "64em")
public class CourseListView extends StandardListView<Course> {
}