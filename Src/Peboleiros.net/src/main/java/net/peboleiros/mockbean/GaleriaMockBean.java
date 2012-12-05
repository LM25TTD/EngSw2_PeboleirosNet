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
	private List<String> videos;
	

    @PostConstruct
    public void init() {
        images = new ArrayList<String>(10);

        for(int i=1;i<=10;i++) {
            images.add("foto" + i + ".jpg");
        }
        
        imagesPartida = new ArrayList<String>(2);
        imagesPartida.add("foto1.jpg");
        imagesPartida.add("foto4.jpg");
        
        videos= new ArrayList<String>(4);
        videos.add("http://www.youtube.com/v/A8ZaWb677kY");
        videos.add("http://www.youtube.com/v/qWybPgF0OvU");
        videos.add("http://www.youtube.com/v/9jzlc4KVlw0");
        videos.add("http://www.youtube.com/v/KZnUr8lcqjo");
        
        
        
    }

    public List<String> getImages() {
        return images;
    }

	public List<String> getImagesPartida() {
		return imagesPartida;
	}

	public List<String> getVideos() {
		return videos;
	}

	public void setVideos(List<String> videos) {
		this.videos = videos;
	}
    
    

}
