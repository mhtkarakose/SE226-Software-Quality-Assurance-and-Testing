package mhtkarakose.com.assignment0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	
	/*
	Mehmet KARAKÖSE
	14070006018
	
	*/

    TextView a,b,c;
    Button enter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Interface access
        setContentView(R.layout.activity_main);
        a = (TextView) findViewById(R.id.txta);
        b = (TextView) findViewById(R.id.txtb);
        c = (TextView) findViewById(R.id.txtc);
        enter = (Button) findViewById(R.id.button2);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(String.valueOf(a.getText()));
                int B = Integer.parseInt(String.valueOf(b.getText()));
                int C = Integer.parseInt(String.valueOf(c.getText()));

                if (A <=50 && B <=50 && C <=50 && A < B + C && B < A + C && C < A + B){

                    if ( A == B && A == C && B == C){
                        //Screen output
                        Toast.makeText(getApplicationContext(),"Equilateral ",Toast.LENGTH_LONG).show();

                    }else if ( A == B && A != C || A == C && A != B){
                        //Screen output
                        Toast.makeText(getApplicationContext(),"Isosceles ",Toast.LENGTH_LONG).show();

                    }else if ( A != B && A != C && B != C){
                        //Screen output
                        Toast.makeText(getApplicationContext(),"Scalene ",Toast.LENGTH_LONG).show();

                    }

                }else {
                    //Screen output
                    Toast.makeText(getApplicationContext(),"NotATriangle ",Toast.LENGTH_LONG).show();
                }

            }
        });



    }
}
