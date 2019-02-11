package sb.q.s.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Nice");
        
        //GitHub에서 데이터가 변경...
        //내가 원하는 추가 작업
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
