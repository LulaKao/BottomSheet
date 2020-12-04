package com.quarterlife.bottomsheettest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    private Button btn_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initView
        btn_dialog = findViewById(R.id.btn_dialog);

        // 設置 btn_dialog 的點擊事件
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 在 MainActivity 裡開啟 BottomSheetDialog 載入一個 Layout（bottom_sheet.xml）
                BottomSheetDialog dialog = new BottomSheetDialog(MainActivity.this);
                dialog.setContentView(R.layout.bottom_sheet);
//                getLayoutInflater().inflate(R.layout.bottom_sheet, null);
                dialog.show();
            }
        });
    }
}