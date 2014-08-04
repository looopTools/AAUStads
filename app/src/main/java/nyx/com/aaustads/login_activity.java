package nyx.com.aaustads;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import nyx.com.aaustads.model.UserModel;
import nyx.com.aaustads.nyx.com.aaustads.logic.CheckCredentials;


public class login_activity extends Activity {

    private UserModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        model = new UserModel();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void checkCreds(View view){
        String username = ((EditText) findViewById(R.id.usernameInput)).getText().toString();
        String password = ((EditText) findViewById(R.id.passwordInput)).getText().toString();
        if(CheckCredentials.isStadsUser(username, password)) {
            Toast t = Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_SHORT);
            t.show();
        }

    }
}
