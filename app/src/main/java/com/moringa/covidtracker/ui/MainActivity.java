package com.moringa.covidtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.moringa.covidtracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.HomepageEnterButton)
    Button mAboutButton;
    @BindView(R.id.appNameTextView)
    TextView mappNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        }

    //adding the additional menu to the menu bar
    @Override
    public boolean onCreateOptionsMenu (Menu
    menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);
        return true;
    }

    //setting up functions for the menu bar items
//    @Override
//    public boolean onOptionsItemSelected (MenuItem item){
//        int id = item.getItemId();
//        if (id == R.id.action_logout) {
//            logout();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//
//        if (item.getItemId() == R.id.item1) {
//            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
//            startActivity(intent);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);




    @Override
    public void onClick(View v) {
        mAboutButton.setOnClickListener(this);
        if (v == mAboutButton) {
            String name = mappNameTextView.getText().toString();
            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
            intent.putExtra("userName", name);
            startActivity(intent);

        }
    }

    private void logout() {
        FirebaseAuth.getInstance().signOut();
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}