package android.kulcare_pharmacy.com.observerandobservable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by prateekarora on 2/18/16.
 */
public class SecondActivity extends Activity implements Observer, View.OnClickListener {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Test.getObserver().addObserver(this);

        btn = (Button) findViewById(R.id.button1);
        btn.setText("value: " + Test.getObserver().getName());
        btn.setOnClickListener(this);
    }

    @Override
    public void update(Observable observable, Object data) {
        // This method is notified after data changes.
        Toast.makeText(this, "SecondActivity notified" + Test.getObserver().getName(),
                Toast.LENGTH_SHORT).show();
        btn.setText("value: " + Test.getObserver().getName());
    }

    @Override
    public void onClick(View v) {
        Test.getObserver().setName("After Value Changed!");
    }
}
