package grapp.grapp;

import javax.validation.constraints.Size;

public class Formulario {
    @Size(min=2,max=10)
    private String text;
    //private Object img;
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    /*public Object getImg() {
        return img;
    }
    public void setImg(Object img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Formulario [img=" + img + ", text=" + text + "]";
    }
    */
}

