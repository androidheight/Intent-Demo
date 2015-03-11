package intent.androidheight.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {
TextView tvUsername,tvPassword,tvActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvUsername =(TextView)findViewById(R.id.tvusername);
        tvPassword =(TextView)findViewById(R.id.tvpassword);
        tvActivity =(TextView)findViewById(R.id.tvActivity);
        //here getting the username and password
        Bundle bundle = getIntent().getExtras();
        tvUsername.setText(bundle.getString("user"));
        tvPassword.setText(""+(bundle.getInt("pass")));

        tvActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here using implicit Intent
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://androidheight.blogspot.in/2015/02/what-is-activity-in-android.html")));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
