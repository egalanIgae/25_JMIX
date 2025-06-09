package com.demo1.demouidataaware.view.editor;


import com.demo1.demouidataaware.entity.Post;
import com.demo1.demouidataaware.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "editor-view", layout = MainView.class)
@ViewController(id = "EditorView")
@ViewDescriptor(path = "editor-view.xml")
public class EditorView extends StandardView {

    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private InstanceContainer<Post> postDc;

    @Subscribe
    public void onInit(InitEvent event) {

        Post post;

        try {
            post = dataManager.load(Post.class).all().one();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            post = dataManager.create(Post.class);
        }

//        if(post==null){
//            post = dataManager.create(Post.class);
//        }
        postDc.setItem(post);

    }

    @Subscribe(id = "saveButton", subject = "clickListener")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        dataManager.save(postDc.getItem());
    }

}