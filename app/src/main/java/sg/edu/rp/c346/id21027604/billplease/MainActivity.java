package sg.edu.rp.c346.id21027604.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    TextView amtDisplay;
    EditText amtInput;
    TextView paxDisplay;
    EditText paxInput;
    ToggleButton SVSToggle;
    ToggleButton GSTToggle;
    TextView discDisplay;
    EditText discInput;
    RadioGroup rgPayment;
    ToggleButton splitBtn;
    ToggleButton resetBtn;
    TextView totalBill;
    TextView eachBill;
    TextView amtTotal;
    TextView oneAmt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amtDisplay = findViewById(R.id.amountName);
        amtInput = findViewById(R.id.amountEdit);
        paxDisplay = findViewById(R.id.noOfPax);
        paxInput = findViewById(R.id.noOfPaxEdit);
        SVSToggle = findViewById(R.id.SVStgbt);
        GSTToggle = findViewById(R.id.GSTtgbt);
        discDisplay = findViewById(R.id.Discount);
        discInput = findViewById(R.id.editTextDiscountAmount);
        rgPayment = findViewById(R.id.paymentMode);
        splitBtn = findViewById(R.id.splitbtn);
        resetBtn = findViewById(R.id.resetbtn);
        totalBill = findViewById(R.id.totalDisplay);
        eachBill = findViewById(R.id.billEach);
        amtTotal = findViewById(R.id.totalAmt);
        oneAmt = findViewById(R.id.billAmt);


        String value = amtInput.getText().toString();
        String noPax = paxInput.getText().toString();
        String disc = discInput.getText().toString();
        String payOne = oneAmt.getText().toString();
        String payTotal = amtTotal.getText().toString();

        double amt = Double.parseDouble(value);
        double pax = Double.parseDouble(noPax);
        double discount = Double.parseDouble(disc);
        double onePay = Double.parseDouble(payOne);
        double totalPay = Double.parseDouble(payTotal);

        splitBtn.setOnClickListener(new View.OnClickListener()) {
        SVSToggle.setOnClickListener(new View.OnClickListener()) {
        GSTToggle.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View view) {
                if(SVSToggle.isChecked()){
                    amt + (amt*0.1);
                } else {

                }
            }
        });
            @Override
            public void onClick(View view) {
                if(GSTToggle.isChecked()){
                    amt + (amt*0.07);
                }
            }
        });
            @Override
            public void OnClick(View view) {
                if(splitBtn.isChecked()) {
                    amt/pax;
                }
            }
        }
                }

            }
