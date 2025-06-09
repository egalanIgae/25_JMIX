package com.company.mainmenudemo.view.discussionforums;


import com.company.mainmenudemo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "discussion-forums-view", layout = MainView.class)
@ViewController(id = "DiscussionForumsView")
@ViewDescriptor(path = "discussion-forums-view.xml")
public class DiscussionForumsView extends StandardView {
}