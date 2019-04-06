package com.example.asyrofiabdusani.basketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int jumlah_skor_A, jumlah_skor_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**digunakan untuk membuat button +3 point pada skor tim A berfungsi
     * yaitu dengan menambahkan 3 point pada skor tim A
     */
    public void three_point_A(View view){
        jumlah_skor_A=jumlah_skor_A+3;
        displayskorA(jumlah_skor_A);
    }
    /**digunakan untuk membuat button +2 point pada skor tim A berfungsi
     * yaitu dengan menambahkan 2 point pada skor tim A
     */
    public void two_point_A(View view){
        jumlah_skor_A=jumlah_skor_A+2;
        displayskorA(jumlah_skor_A);
    }
    /**digunakan untuk membuat button pinalty point pada skor tim A berfungsi
     * yaitu dengan menambahkan 1 point pada skor tim A
     */
    public void pinalty_point_A(View view){
        jumlah_skor_A=jumlah_skor_A+1;
        displayskorA(jumlah_skor_A);
    }
    /**digunakan untuk membuat method displayskorA bisa berjalan sebagaimana mestinya
     */
    private void displayskorA(int skor_A){
        TextView skorA=(TextView)findViewById(R.id.skor_tim_A);
        skorA.setText(""+skor_A);
    }
    /**digunakan untuk membuat button +3 point pada skor tim B berfungsi
     * yaitu dengan menambahkan 3 point pada skor tim B
     */
    public void three_point_B(View view){
        jumlah_skor_B=jumlah_skor_B+3;
        displayskorB(jumlah_skor_B);
    }
    /**digunakan untuk membuat button +2 point pada skor tim B berfungsi
     * yaitu dengan menambahkan 2 point pada skor tim B
     */
    public void two_point_B(View view){
        jumlah_skor_B=jumlah_skor_B+2;
        displayskorB(jumlah_skor_B);
    }
    /**digunakan untuk membuat button pinalty point pada skor tim B berfungsi
     * yaitu dengan menambahkan 1 point pada skor tim B
     */
    public void pinalty_point_B(View view){
        jumlah_skor_B=jumlah_skor_B+1;
        displayskorB(jumlah_skor_B);
    }
    /**digunakan untuk membuat method displayskorB bisa berjalan sebagaimana mestinya
     */
    private void displayskorB(int skor_B){
        TextView skorB=(TextView)findViewById(R.id.skor_tim_B);
        skorB.setText(""+skor_B);
    }
    /**digunakan untuk membuat button reset berfungsi dengan mengembalikan skor tim A & B
     * kembali 0
     */
    public void reset(View view){
        jumlah_skor_A=jumlah_skor_A-jumlah_skor_A;
        jumlah_skor_B=jumlah_skor_B-jumlah_skor_B;
        displayskorA(jumlah_skor_A);
        displayskorB(jumlah_skor_B);
    }
}
