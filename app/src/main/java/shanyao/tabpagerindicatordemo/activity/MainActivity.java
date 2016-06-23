package shanyao.tabpagerindicatordemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import shanyao.tabpagerindicatordemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.MODE_WEIGHT_NOEXPAND_SAME).setOnClickListener(this);
        findViewById(R.id.MODE_WEIGHT_NOEXPAND_NOSAME).setOnClickListener(this);
        findViewById(R.id.MODE_NOWEIGHT_NOEXPAND_SAME).setOnClickListener(this);
        findViewById(R.id.MODE_NOWEIGHT_NOEXPAND_NOSAME).setOnClickListener(this);
        findViewById(R.id.MODE_NOWEIGHT_EXPAND_SAME).setOnClickListener(this);
        findViewById(R.id.MODE_NOWEIGHT_EXPAND_NOSAME).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.MODE_WEIGHT_NOEXPAND_SAME:
                startActivity(new Intent(MainActivity.this, WeightNoExpandSame.class));
                break;
            case R.id.MODE_WEIGHT_NOEXPAND_NOSAME:
                startActivity(new Intent(MainActivity.this, WeightNoExpandNoSame.class));
                break;
            case R.id.MODE_NOWEIGHT_NOEXPAND_SAME:
                startActivity(new Intent(MainActivity.this, NoWeightNoExpandSame.class));
                break;
            case R.id.MODE_NOWEIGHT_NOEXPAND_NOSAME:
                startActivity(new Intent(MainActivity.this, NoWeightNoExpandNoSame.class));
                break;
            case R.id.MODE_NOWEIGHT_EXPAND_SAME:
                startActivity(new Intent(MainActivity.this, NoWeightExpandSame.class));
                break;
            case R.id.MODE_NOWEIGHT_EXPAND_NOSAME:
                startActivity(new Intent(MainActivity.this, NoWeightExpandNoSame.class));
                break;
        }
    }
}
