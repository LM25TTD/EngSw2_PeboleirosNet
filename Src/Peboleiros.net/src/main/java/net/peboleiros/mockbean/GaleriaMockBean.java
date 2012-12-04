package net.peboleiros.mockbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("galeriaMockBean")
@Scope("session")
public class GaleriaMockBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 67835314811932477L;
	private List<String> images;

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();

        for(int i=1;i<=10;i++) {
            images.add("foto" + i + ".jpg");
        }
    }

    public List<String> getImages() {
        return images;
    }

}
