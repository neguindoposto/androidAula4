package com.htcursos.aula4intents.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.htcursos.aula4intents.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 22/10/2016.
 */
public class AActivity extends AppCompatActivity {

    @BindView(R.id.btn_next)
    Button btnNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);

        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
                Intent i = new Intent(AActivity.this,BActivity.class);
                startActivity(i);
            }
        });

    }
}
