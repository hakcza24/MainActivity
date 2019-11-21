package com.example.mainactivity.Real;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.mainactivity.R;

public class dataDetail extends SQLiteOpenHelper {
    Context context;

    private static int version = 1;
    private static String dbname = "DB.sqlite";
    private  static String CreateTable = "CREATE TABLE GAME_LIST ("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT, "+
            "picid TEXT, "+
            "name TEXT, "+
            "price TEXT, "+
            "detail TEXT "+
            ");";
    private static String Insert = "INSERT INTO GAME_LIST(picid,name,price,detail)"+
            "VALUES"+
            "("+R.drawable.pc1+ ",'AMD',"+"'"+"คอมพิวเตอร์ระดับสูง ของใหม่ทั้งหมด พร้อมใช้งานนะครับ เมนบอร์ดชิพใหญ่, แรมให้เยอะและบัสสูง, SSD แบบ NVME M.2 Read 3100MB/s การ์ดจอรุ่นใหญ่ และ Power Supply แบบ 80+ Bronzeครับ CPU : AMD RYZEN 7 3800X Turbo 4.4Ghz 8C 16T \n" +
            "MB : AM4 B450 (X570 + 4000.-)\n" +
            "RAM : 16GB 3200 MHZ DDR4\n" +
            "VGA : เลือกได้ตามใจชอบครับ\n" +
            "SSD : M.2 NVME 256GB Read: 3100MB/s Write: 1600MB/s (512GB + 1,000.-, 1TB + 2,000.-)\n" +
            "HDD : 1TB WD\n" +
            "CASE : เลือก case ได้ ( ส่งแบบ case ที่ต้องการ ทาง inbox ครับ )\n" +
            "PSU : FSP 700W 80+ Bronze\n" +
            "\n" +
            "#ประกันสินค้า  3 ปี"+"'"+"),"+
            "("+R.drawable.pc2+",'PS4','13,000',"+"'"+"เพลย์สเตชั่น 4 สลิม ดีไซน์ใหม่จาก SONY ที่มาในรูปแบบที่เพรียวบางลง พร้อมการรองรับภาพระดับ FULL HD มาพร้อมกับตัว DualShock 4 แบบใหม่ที่บอกสถานะไฟแบตด้านหน้า ให้คุณได้สัมผัสประสบการณ์การเล่นเกมส์ที่เหนือขึ้นไปอีกระดับ ในรุ่น PS4 SLIM : JET BLACK [1TB]\n" +
            "ประกันสินค้า 1 ปี 3 เดือน\n" +
            "ภายในกล่องสินค้า\n" +
            "- PS4 System x 1\n" +
            "- DUALSHOCK®4 Wireless Controller x 1\n" +
            "- Mono Headset x 1\n" +
            "- AC Power Cord x 1\n" +
            "- HDMI Cable x 1\n" +
            "- USB cable x 1"+"'"+"),"+
            "("+R.drawable.pc3+",'Intel','14,000',"+"'"+"CPU i5 2500 3.70GHz มือ2ประกัน3เดือน\n" +
            "MB P8H61 มือ1ประกัน1ปี\n" +
            "Ram DR3 8GB มือ1ประกัน3ปี\n" +
            "GPU GTX 1050TI 4GB มือ2ประกัน1ปี\n" +
            "HDD 240GB มือ1ประกัน3ปี\n" +
            "Power 550w มือ1ประกัน1ปี\n" +
            "Case Spirit Halo มือ1\n" +
            "จอ LED 21.5นิ้ว มือ1ประกัน3ปี\n" +
            "คีย์บอร์ด+เมาส์+แผ่นรองเมาส์+หูฟัง+WIFI"+"'"+"),"+
            "("+R.drawable.pc4+",'Xbox','10,494','"+"  quickly jump from TV to movies to music to a game\n" +
            "vast and scalable power of the cloud for your games\n" +
            "8GB of RAM\n" +
            "ไมโครซอฟท์ (Microsoft) เปิดตัว Xbox One เครื่องเล่นเกมยุคที่ 3 ใช้ Blu-ray รองรับ Multi-Tasking เล่นเกม, ดูหนัง, ฟังเพลงพร้อมกันได้"+"'),"+
            "("+R.drawable.pc5+",'Alienware','89,200','"+"คCPU Intel Core i7-9750H (2.60 GHzup to 4.50 GHz)\n" +
            "GPU Nvidia GeForce RTX 2070 8 GB GDDR6 with Max-Q\n" +
            "Display 15.6\" FULL HD 240Hz WITH TOBII EYETRACKING\n" +
            "Memory 16 GB DDR4\n" +
            "Storage 512 GB PCIe/NVMe M.2 SSD\n" +
            "Wireless Killer Wi-Fi 6 AX1650 (2x2)\n" +
            "Web CameraHD Camera\n" +
            "OS Windows 10 Home (64 Bit)\n" +
            "Warranty 2Y\n" +
            "2.16 KG"+"'),"+
            "("+R.drawable.pc6+",'Predator','"+"เCPU : INTEL CORE I7-7820HK\n" +
            "RAM : 64 GB\n" +
            "HDD : 1 TB + 512 GB SSD (X2 RAID)\n" +
            "DISPLAY : 21\" IPS\n" +
            "VGA : GTX 1080SLI\n" +
            "OS : WINDOWS 10 HOME"+"');";









    public dataDetail(@Nullable Context context) {
        super(context, dbname, null, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable);
        db.execSQL(Insert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
