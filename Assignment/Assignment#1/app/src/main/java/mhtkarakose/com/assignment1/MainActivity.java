package mhtkarakose.com.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_message = (TextView) findViewById(R.id.txt_message);
    }

    public void buttonClick(View v){

        switch (v.getId()){
            case R.id.btn_pay:
                switch (v.getId()){
                    case R.id.rd_050:
                        break;
                    case R.id.rd_075:
                        break;
                    case R.id.rd_1:
                        break;
                    case R.id.rd_125:
                        break;
                    case R.id.rd_150:
                        break;
                    case R.id.rd_175:
                        break;
                    case R.id.rd_2:
                        break;
                }
                break;
            default:
                txt_message.setText("Ödeme yapınız");
                break;

        }



    }


}
