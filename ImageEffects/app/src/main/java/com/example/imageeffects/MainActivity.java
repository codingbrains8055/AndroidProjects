package com.example.imageeffects;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView myImageView;
    Drawable myLogo;
    Bitmap bitmapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       myImageView = findViewById(R.id.myImage);
        /* myLogo = ResourcesCompat.getDrawable(getResources(), R.drawable.animage, null);
        bitmapImage = ((BitmapDrawable) myLogo).getBitmap();

        Bitmap newPhoto = invertImage(bitmapImage);
        myImageView.setImageBitmap(newPhoto); */

        Drawable[] layers = new Drawable[2];
        layers[0] = getResources().getDrawable(R.drawable.filterimage);
        layers[1] = getResources().getDrawable(R.drawable.animage);
        LayerDrawable layerDrawable = new LayerDrawable(layers);
        myImageView.setImageDrawable(layerDrawable);
    }

    public static Bitmap invertImage(Bitmap img){
        Bitmap finalImage = Bitmap.createBitmap(img.getWidth(), img.getHeight(), img.getConfig());

        int A,R,G,B;
        int pixelColor;
        int height = img.getHeight();
        int width = img.getWidth();

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                pixelColor = img.getPixel(x, y);
                A = Color.alpha(pixelColor);
                R = 255 - Color.red(pixelColor);
                G = 255 - Color.green(pixelColor);
                B = 255 - Color.blue(pixelColor);

                finalImage.setPixel(x, y, Color.argb(A, R, G, B));
            }
        }
        return finalImage;
    }

}
