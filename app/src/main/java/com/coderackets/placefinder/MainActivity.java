package com.coderackets.placefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //Data
    final String[] places={"A_Gs_Office","A_Gs_Staff_Quarters","Anandnagar","AP_Police_Academy_PO","Banjara_Hills","Bazarghat","Bhaskar_Nagar","C_B_I_T","Central_Secretariat","CUC","Cyberabad","Dargah_Hussain_Shahwali","Dr_B_R_Ambedkar_O_U","Erragadda","Film_Nagar","Gagan_Mahal","Gandhi_Bhawan","Golconda","Himayathnagar","Humayunnagar","Hyder_Shah_Kote","Hydershahkote","I_M_Colony","Ibrahim_Bagh_Lines","Jubilee_Hills","Kakatiya_Nagar","Karwan_Sahu","Khairatabad","Kothaguda_K_V_Rangareddy","Kulsumpura","LIC_Division","Lunger_House","Mangalhat","Manikonda","Manuu","Moazzampura","Murad_Nagar","Nanakramguda","Narayanguda","New_Mla_Quarters","Parishram_Bhawan","Putlibowli","Raj_Bhawan","Ramakrishna_Mutt","Sakkubai_Nagar","Sanath_Nagar_Colony","Sanathnagar_I_E","Sanjeev_Reddy_Nagar","Seetharampet","Shantinagar","Somajiguda","Srinagar_Colony","State_Bank_Of_Hyderabad","State_Bank_Of_India","Toli_Chowki","Vengal_Rao_Nagar","Vidhan_Sabha","Vijay_Nagar_Colony","Vivekananda_Nagar_Colony","Yousufguda","G_P_O_","Ambernagar","Amberpet","Andhra_Mahila_Sabha","Badangpet","Bahadurpura","Barkatpura","Begumbazar","Boduppal","Crp_Camp","Darushifa","Don_Bosco_Nagar","Falaknuma","Fatehdarwaza","Gayatri_Nagar","GsiSr_Bandlaguda","High_Court","Hindustan_Cables_Ltd","Hussainialam","Jubilee","Public_School","Hyderguda","I_E_Nacharam","Kanchanbagh","Kattedan_Ie","Keshogiri","Kishanbagh","Kismathpur","L_B_Nagar","Malakpet_Colony","Mamidipalli","Medipalli","Meerpet","Moghalpura","Nallakunta","New_Nallakunta","Nimboliadda","Old_Malakpet","Osmannagar","P_&_T_Colony_K_V_Rangareddy","Peerzadiguda","R_C_Imarat","Rajendranagar_K_V_Rangareddy","Sahifa","Saidabad_Colony","Saidabad","Santoshnagar_Colony","Saroornagar","Seminary","Shahalibanda","Srinivasapuram","Sripuram_Colony","Stn_Kachiguda","Svpnpa","Tadbun","Uppuguda","Vaishalinagar","Vanastalipuram","Vidyanagar","Yakutpura","Zindatelismath","Administrative_Buildings","Airforce_Academy","Aliabad","Allampalli","Alwal","Anandbagh","Anantaram","Ankireddipalli","Ankushapur","Aoc_Records","Aphb_Colony_Moulali","Ashoknagar","Bahadurpalli","Balanagar_Township","Begumpet_Policelines","Begumpet","BITS","Bogaram","Bolarum_Bazar","Bolarum","Bowenpally","Chandanagar","Cherial","Cherlapalli","CIE_Balangar","CRPF","Dabirpur","Dr_As_Rao_Nagar","Ecil","EME_Records","Gajularamaram","Gandhinagar","Girmapur","Golconda_Chowrastha","Gowdavalli","Haiglines","Hakimpet","Hal","Hanumanpet","Himmatnagar","HMT_Township","IDA_Jeedimetla","Ie_Moulali","IICT","Jaggamguda","Jai_Jawan_Colony","Jama_I_Osmania","Jawahar_Nagar","JJ_Nagar_Colony","Jntu_Kukat_Pally","Katchavanisingaram","Keesara","Keesaragutta","Kingsway","Kolthur","Komplly","Korremal","Kowkoor","KPHB_Colony","Kukatpally","Kushaiguda","Kutbullapur","Kyasaram","Lalgadi_Malakpet","Lallaguda","Lallapet","Malkajgiri","Manovikasnagar","MG_Road","Miyapur","Moulali","Mudchintanapalli","Musheerabad_Delivery","Musheerabad_ND","Nagaram_K_V_Rangareddy","Nehrunagar","Neredmet","Ngri","Nisa_Hakimpet","Nizampet","Nutankal","Padmaraonagar","Peddalaxmapur","Picket","Pragatinagar","Prakashamnagar","Pratapsingaram","Rail_Nilayam","Rajbolaram","Rajeevagruhakalpa","Ramakrishna_Puram","Rampallidiara","Rangareddynagar","Ravalkol","Rompalli","Sainikpuri","Samskruthi","Secunderabad","Shamirpet","Sitaphalmandi","Suchitra_Junction","Suraram","Tarnaka","Thimmaipalli","Thumkunta","Trimulgherry","Turkapalliyadaram","Vikarabad","Vikasnagar","Vivekanandanagar_Colony","Yadgarpalli","Zamistanpur"};
    final int[] pinCodes={500004,500045,500004,500091,500034,500004,500075,500075,500022,500046,500081,500008,500033,500018,500096,500029,500001,500008,500029,500028,500008,500091,500082,500031,500033,500008,500006,500004,500084,500006,500063,500008,500006,500089,500032,500001,500028,500008,500029,500063,500004,500095,500041,500029,500008,500018,500018,500038,500001,500028,500082,500073,500001,500095,500008,500038,500004,500057,500018,500045,500001,500044,500013,500044,500058,500064,500027,500012,500092,500005,500024,500086,500053,500065,500097,500068,500066,500051,500064,500002,500013,500048,500076,500058,500077,500005,500064,500030,500074,500036,500005,500098,500097,500002,500044,500044,500027,500036,500036,500060,500039,500069,500030,500024,500059,500059,500059,500035,500013,500065,500013,500036,500027,500052,500064,500053,500079,500070,500044,500023,500013,500007,500043,500101,501102,500010,500047,500101,501301,501301,500015,500040,500020,500043,500037,500003,500016,500078,501301,500010,500010,500011,500050,501301,501301,500037,500078,501401,500062,500062,500015,500055,500080,501401,500020,501401,500010,500014,500042,500047,500025,500054,500055,500040,500007,500101,500062,500007,500087,500087,500085,500088,501301,501301,500003,500101,500100,500088,500010,500085,500072,500062,500055,500101,500101,500017,500017,500047,500009,500003,500049,500040,500101,500020,500020,500083,500026,500056,500007,500078,500090,501401,500025,500101,500009,500090,500016,500088,500025,501401,500088,500056,501301,500037,501401,501301,500094,500088,500003,500101,500061,500067,500055,500007,501301,500078,500015,500101,501101,500093,500072,501301,500020};

    //Componet declaration
    EditText    pinCodeI;
    Button      submitB;
    TextView    resultT;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing components
        pinCodeI    =   findViewById(R.id.pinCodeI);
        submitB     =   findViewById(R.id.submitB);
        resultT     =   findViewById(R.id.resultT);

        //setting result text to hidden
        resultT.setVisibility(View.GONE);
        submitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                resultT.setVisibility(View.VISIBLE);
                int pinC=0;
                try
                {
                    pinC=Integer.parseInt(pinCodeI.getText().toString());
                }
                catch (NullPointerException e)
                {
                    Toast.makeText(getApplicationContext(),"Enter a PinCode",Toast.LENGTH_SHORT).show();
                }
                catch(NumberFormatException f)
                {
                    Toast.makeText(getApplicationContext(),"Enter a PinCode",Toast.LENGTH_SHORT).show();
                }
                boolean find=false;
                byte count=0;
                String tempPlace="";
                for(int i=0;i<pinCodes.length;i++)
                {
                    if(pinCodes[i]==pinC)
                    {
//                        resultT.setVisibility(View.VISIBLE);
//                        resultT.setText(places[i]);

                        count++;
                        tempPlace=tempPlace+places[i]+", ";
                        find=true;
                    }
                }
                if(count>1 && find==true)
                {
                    resultT.setText("Multiple places registered with the same pinCode are listed below"+"\n"+tempPlace);
                }
                else if(count<=1 && find==true)
                {
                    resultT.setText("Place registered with the given pinCode is mentioned below "+"\n"+tempPlace);
                }
                else  if(find==false && ((pinC+"").length()>6 || (pinC+"").length()<6))
                {
                    resultT.setText("Enter a valid pinCode number");
                }
                else
                {
                    resultT.setText("the is no pinCode available in this city");
                }
            }

        });
    }
}