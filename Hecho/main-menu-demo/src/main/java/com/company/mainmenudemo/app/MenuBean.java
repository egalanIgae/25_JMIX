package com.company.mainmenudemo.app;

import com.vaadin.flow.component.UI;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MenuBean {

    public void openLink(Map<String,Object> parameters){
        String url = (String) parameters.get("url");
        if(url == null){
            return;
        }

        UI.getCurrent().getPage().open(url);

    }
}