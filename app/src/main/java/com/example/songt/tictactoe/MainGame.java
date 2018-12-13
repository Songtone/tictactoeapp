package com.example.songt.tictactoe;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainGame extends AppCompatActivity {

    private boolean turn = false;
    private boolean draw = true;

    Button butt1, butt2, butt3, butt4, butt5, butt6, butt7, butt8, butt9;
    Button xPlay, oPlay, resetButt;
    TextView winningText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);


        winningText = (TextView) findViewById(R.id.wintext);

        butt1 = (Button) findViewById(R.id.b1);
        butt2 = (Button) findViewById(R.id.b2);
        butt3 = (Button) findViewById(R.id.b3);
        butt4 = (Button) findViewById(R.id.b4);
        butt5 = (Button) findViewById(R.id.b5);
        butt6 = (Button) findViewById(R.id.b6);
        butt7 = (Button) findViewById(R.id.b7);
        butt8 = (Button) findViewById(R.id.b8);
        butt9 = (Button) findViewById(R.id.b9);
        xPlay = (Button) findViewById(R.id.xButt);
        oPlay = (Button) findViewById(R.id.oButt);
        resetButt = (Button) findViewById(R.id.reset);

        butt1.setText("");
        butt2.setText("");
        butt3.setText("");
        butt4.setText("");
        butt5.setText("");
        butt6.setText("");
        butt7.setText("");
        butt8.setText("");
        butt9.setText("");

        xPlay.setBackgroundDrawable(getResources().getDrawable(R.drawable.clickedbutt));
        oPlay.setBackgroundDrawable(getResources().getDrawable(R.drawable.normalbutt));

        xPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turn = false;
                xPlay.setBackgroundDrawable(getResources().getDrawable(R.drawable.clickedbutt));
                oPlay.setBackgroundDrawable(getResources().getDrawable(R.drawable.normalbutt));

            }
        });

        oPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turn = true;
                oPlay.setBackgroundDrawable(getResources().getDrawable(R.drawable.clickedbutt));
                xPlay.setBackgroundDrawable(getResources().getDrawable(R.drawable.normalbutt));
            }
        });

        resetButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                winningText.setText("");
                butt1.setText("");
                butt2.setText("");
                butt3.setText("");
                butt4.setText("");
                butt5.setText("");
                butt6.setText("");
                butt7.setText("");
                butt8.setText("");
                butt9.setText("");
                butt1.setClickable(true);
                butt2.setClickable(true);
                butt3.setClickable(true);
                butt4.setClickable(true);
                butt5.setClickable(true);
                butt6.setClickable(true);
                butt7.setClickable(true);
                butt8.setClickable(true);
                butt9.setClickable(true);

                draw = true;


            }
        });

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt1.setText("X");
                } else if (turn == true) {
                    butt1.setText("O");
                }
                butt1.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt2.setText("X");
                } else if (turn == true) {
                    butt2.setText("O");
                }
                butt2.setClickable(false);

                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt3.setText("X");
                } else if (turn == true) {
                    butt3.setText("O");
                }
                butt3.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt4.setText("X");
                } else if (turn == true) {
                    butt4.setText("O");
                }
                butt4.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt5.setText("X");
                } else if (turn == true) {
                    butt5.setText("O");
                }
                butt5.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt6.setText("X");
                } else if (turn == true) {
                    butt6.setText("O");
                }
                butt6.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt7.setText("X");
                } else if (turn == true) {
                    butt7.setText("O");
                }
                butt7.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });

        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt8.setText("X");
                } else if (turn == true) {
                    butt8.setText("O");
                }
                butt8.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == false) {
                    butt9.setText("X");
                } else if (turn == true) {
                    butt9.setText("O");
                }
                butt9.setClickable(false);
                checkXWin();
                checkOWin();
                checkDraw();
            }
        });


    }

    public void checkXWin() {
        if (butt1.getText() == "X" && butt2.getText() == "X" && butt3.getText() == "X") {
            winningText.setText("Player " + butt1.getText() + " Wins!");
            draw = false;
        } else if (butt4.getText() == "X" && butt5.getText() == "X" && butt6.getText() == "X") {
            winningText.setText("Player " + butt4.getText() + " Wins!");
            draw = false;
        } else if (butt7.getText() == "X" && butt8.getText() == "X" && butt9.getText() == "X") {
            winningText.setText("Player " + butt7.getText() + " Wins!");
            draw = false;
        } else if (butt1.getText() == "X" && butt4.getText() == "X" && butt7.getText()== "X") {
            winningText.setText("Player " + butt1.getText() + " Wins!");
            draw = false;
        } else if (butt2.getText() == "X" && butt5.getText() == "X" && butt8.getText()== "X") {
            winningText.setText("Player " + butt2.getText() + " Wins!");
            draw = false;
        } else if (butt3.getText() == "X" && butt6.getText() == "X" && butt9.getText()== "X") {
            winningText.setText("Player " + butt3.getText() + " Wins!");
            draw = false;
        } else if (butt1.getText() == "X" && butt5.getText() == "X" &&  butt9.getText()== "X") {
            winningText.setText("Player " + butt1.getText() + " Wins!");
            draw = false;
        } else if (butt3.getText() == "X" && butt5.getText() == "X" && butt7.getText()== "X") {
            winningText.setText("Player " + butt3.getText() + " Wins!");
            draw = false;
        }
        if(draw == false){
            butt1.setClickable(false);
            butt2.setClickable(false);
            butt3.setClickable(false);
            butt4.setClickable(false);
            butt5.setClickable(false);
            butt6.setClickable(false);
            butt7.setClickable(false);
            butt8.setClickable(false);
            butt9.setClickable(false);
        }
    }

    public void checkOWin() {
        if (butt1.getText() == "O" && butt2.getText() == "O" && butt3.getText() == "O") {
            winningText.setText("Player " + butt1.getText() + " Wins!");
            draw = false;
        } else if (butt4.getText() == "O" && butt5.getText() == "O" && butt6.getText() == "O") {
            winningText.setText("Player " + butt4.getText() + " Wins!");
            draw = false;
        } else if (butt7.getText() == "O" && butt8.getText() == "O" && butt9.getText() == "O") {
            winningText.setText("Player " + butt7.getText() + " Wins!");
            draw = false;
        } else if (butt1.getText() == "O" && butt4.getText() == "O" && butt7.getText()== "O") {
            winningText.setText("Player " + butt1.getText() + " Wins!");
            draw = false;
        } else if (butt2.getText() == "O" && butt5.getText() == "O" && butt8.getText()== "O") {
            winningText.setText("Player " + butt2.getText() + " Wins!");
            draw = false;
        } else if (butt3.getText() == "O" && butt6.getText() == "O" && butt9.getText()== "O") {
            winningText.setText("Player " + butt3.getText() + " Wins!");
            draw = false;
        } else if (butt1.getText() == "O" && butt5.getText() == "O" &&  butt9.getText()== "O") {
            winningText.setText("Player " + butt1.getText() + " Wins!");
            draw = false;
        } else if (butt3.getText() == "O" && butt5.getText() == "O" && butt7.getText()== "O") {
            winningText.setText("Player " + butt3.getText() + " Wins!");
            draw = false;
        }
        if(draw == false){
            butt1.setClickable(false);
            butt2.setClickable(false);
            butt3.setClickable(false);
            butt4.setClickable(false);
            butt5.setClickable(false);
            butt6.setClickable(false);
            butt7.setClickable(false);
            butt8.setClickable(false);
            butt9.setClickable(false);
        }
    }

    public void checkDraw(){
        if(butt1.getText() != "" && butt2.getText() != "" && butt3.getText() != "" && butt4.getText() != "" && butt5.getText() != "" && butt6.getText() != "" && butt7.getText() != "" && butt8.getText() != "" && butt9.getText() != "" && draw == true){
            winningText.setText("DRAW!");
        }
    }

}
