package com.example.practical_4_2_checkbox_and_etc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox mChocolateSyrup, mSprinkles, mCrushedNuts, mCherries, mOrioCookiesCrumbles;
    private Button mShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChocolateSyrup = (CheckBox) findViewById(R.id.chk_chocolate);
        mSprinkles = (CheckBox) findViewById(R.id.chk_sprinkles);
        mCrushedNuts = (CheckBox) findViewById(R.id.chk_crushed);
        mCherries = (CheckBox) findViewById(R.id.chk_cherries);
        mOrioCookiesCrumbles = (CheckBox) findViewById(R.id.chk_orio);
        mShowToast = (Button) findViewById(R.id.button_toast);
        mShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Topping :");
                if (mChocolateSyrup.isChecked()) {
                    result.append("\t" + mChocolateSyrup.getText().toString());
                }
                if (mSprinkles.isChecked()) {
                    result.append("\t" + mSprinkles.getText().toString());
                }
                if (mCrushedNuts.isChecked()) {
                    result.append("\t" + mCrushedNuts.getText().toString());
                }
                if (mCherries.isChecked()) {
                    result.append("\t" + mCherries.getText().toString());
                }
                if (mOrioCookiesCrumbles.isChecked()) {
                    result.append("\t" + mOrioCookiesCrumbles.getText().toString());
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.chk_chocolate:
                if (checked)
                    Log.d("mChocolateSyrup", "Checked");
                break;
            case R.id.chk_sprinkles:
                if (checked)
                    Log.d("mSprinkles", "Checked");
                break;
            case R.id.chk_crushed:
                if (checked)
                    Log.d("mCrushedNuts", "Checked");
                break;
            case R.id.chk_cherries:
                if (checked)
                    Log.d("mCherries", "Checked");
                break;
            case R.id.chk_orio:
                if (checked)
                    Log.d("mOrioCookiesCrumbles", "Checked");
                break;
            }
        }
}














