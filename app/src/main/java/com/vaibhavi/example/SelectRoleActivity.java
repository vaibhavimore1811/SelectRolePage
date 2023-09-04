package com.vaibahvi.example.activity;




public class SelectRoleActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout  linerLylOptionOne,linerLylOptionTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_role);
        initView();
    }

    private void initView() {
        linerLylOptionOne = findViewById(R.id.linerLylOptionOne);
        linerLylOptionTwo = findViewById(R.id.linerLylOptionTwo);
        linerLylOptionTwo.setOnClickListener(this);
        linerLylOptionOne.setOnClickListener(this);


    }

    @SuppressLint({"NonConstantResourceId", "UseCompatLoadingForDrawables"})
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.linerLylOptionOne:
  
               //perform action
                
                break;
            case R.id.linerLylOptionTwo:
                //perform action
               
                break;




        }
    }

}
