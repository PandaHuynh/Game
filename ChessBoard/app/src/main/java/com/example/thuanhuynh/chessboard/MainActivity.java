package com.example.thuanhuynh.chessboard;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends Activity {
    private ImageView imageView;
    private ChessBoard chessBoard;
    private Bitmap bitmap;
    private View.OnTouchListener view;
    private Object event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imgView);
        chessBoard = new ChessBoard(MainActivity.this, 900, 800, 8,9);
        chessBoard.init();
        bitmap = chessBoard.drawBoard();

        imageView.setImageBitmap(bitmap);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return chessBoard.onTouch(view,motionEvent);
            }
        });

    }
}
