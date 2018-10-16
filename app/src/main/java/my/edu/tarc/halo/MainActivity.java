package my.edu.tarc.halo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //oNCreate --> main function
        super.onCreate(savedInstanceState);
        //This method creates the UI
        //R = resource classes
        //layout = design of UI (a folder)
        setContentView(R.layout.activity_main);

    }

    public void showMessage(View view){
        //1.link the UI to the program code
        TextView textViewMessage;  //TextView is a class; textViewMessage is an instance
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello,<your name here>");
    }
}
