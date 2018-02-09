package com.gmail.deal10041.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkClicked(View v) {
        // initialises some variables
        CheckBox checkbox = (CheckBox) v;
        String name = checkbox.getText().toString();
        int imid = 0;

        // determines image id of body part
        switch(name) {
            case "Eyes":      imid = R.id.Eyes;
                              break;
            case "Nose":      imid = R.id.Nose;
                              break;
            case "Hat":       imid = R.id.Hat;
                              break;
            case "Eyebrows":  imid = R.id.Eyebrows;
                              break;
            case "Shoes":     imid = R.id.Shoes;
                              break;
            case "Ears":      imid = R.id.Ears;
                              break;
            case "Mustache":  imid = R.id.Mustache;
                              break;
            case "Arms":      imid = R.id.Arms;
                              break;
            case "Glasses":   imid = R.id.Glasses;
                              break;
            case "Mouth":     imid = R.id.Mouth;
        }
        // toggles between visibility of body part
        if(imid!=0) {
            if (checkbox.isChecked()) {
                ImageView image = findViewById(imid);
                image.setVisibility(0);
            } else {
                ImageView image = findViewById(imid);
                image.setVisibility(4);
            }
        }
    }
}
