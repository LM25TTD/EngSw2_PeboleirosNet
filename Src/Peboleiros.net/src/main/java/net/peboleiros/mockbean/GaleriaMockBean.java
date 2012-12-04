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
	private List<String> imagesPartida;
	

    @PostConstruct
    public void init() {
        images = new ArrayList<String>(10);

        for(int i=1;i<=10;i++) {
            images.add("foto" + i + ".jpg");
        }
        
        imagesPartida = new ArrayList<String>(2);
        imagesPartida.add("foto1.jpg");
        imagesPartida.add("foto4.jpg");
        
        
    }

    public List<String> getImages() {
        return images;
    }

	public List<String> getImagesPartida() {
		return imagesPartida;
	}
    
    

}
