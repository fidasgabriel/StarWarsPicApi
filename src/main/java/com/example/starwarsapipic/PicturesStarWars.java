package com.example.starwarsapipic;

import com.example.starwarsapipic.Model.BaseReturn;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PicturesStarWars {
    @CrossOrigin()
    @GetMapping("/pictures/star-wars/{item}")
    public BaseReturn translation(@PathVariable() int item){
        if(item == 4){
            return new BaseReturn("https://static1.srcdn.com/wordpress/wp-content/uploads/2024/02/star-wars-phantom-menace-matt-ferguson-poster.jpg");
        } else if (item == 5) {
            return new BaseReturn("https://m.media-amazon.com/images/S/pv-target-images/ceefcaee4f0c3147528caf242346221eedfe95e568800472e1088187532a9e49.jpg");
        } else if (item == 6) {
            return new BaseReturn("https://m.media-amazon.com/images/S/pv-target-images/3a991f1ad651779c8701339593c0a7c6afa18ba8844da38a1740e9fea2ebe873.jpg");
        } else if (item == 1) {
            return new BaseReturn("https://i.pinimg.com/originals/48/a9/7f/48a97f9f1f795c872bb0568b201631f2.jpg");
        } else if (item == 2) {
            return new BaseReturn("https://m.media-amazon.com/images/I/711xW80aSGL._AC_UF894,1000_QL80_.jpg");
        }else if (item == 3) {
            return new BaseReturn("https://m.media-amazon.com/images/I/617CD+sLC-L._AC_UF1000,1000_QL80_.jpg");
        }
        return new BaseReturn("");
    }
}
