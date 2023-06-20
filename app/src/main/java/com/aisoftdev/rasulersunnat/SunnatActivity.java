package com.aisoftdev.rasulersunnat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SunnatActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnat);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        mainRecyclerView.setHasFixedSize(true);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list 1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("কিছু কিছু সুন্নতকে বিজ্ঞান এখনো স্বীকৃতি দেয়নি, এর মৌলিক কারণ হলো, বিজ্ঞানীদের গবেষণা এখনো সম্পন্ন হয়নি। তারা যখন \n" +
                "চূড়ান্ত গবেষণায় পৌঁছবে তখন অবশ্যই সুন্নতে নববীকে স্বীকৃতি দেবে।");

        // list2
        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("আমার সঙ্গে এক ব্যক্তি দেখা করতে এসে বললো, আমি রোজা রাখি। সে ছিল আমেরিকান। আমি তাকে বললাম, আপনি তো অমুসলিম। রোজা রাখেন কেন? সে বললো, বছরে কিছু সময় ডায়েট করা উচিৎ। খাবার থেকে কিছুদিন বিরত থাকলে শরীরে এক ধরনের রস নিঃশেষ হয়ে যায়। যার ফলে শরীরের অনেক কঠিন কঠিন রোগ নিরাময় হয়। আমি এবং আমার স্ত্রী ডায়েটিংয়ের জন্য প্রতি বছর এক মাস রোজা রাখার সিদ্ধান্ত নিয়েছি।");
        nestedList2.add("আমি তাকে বললাম, প্রতি মাসে আইয়ামে বীযের তিনটি রোজা রাখা আমাদের নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের সুন্নত। বিশেষ করে অবিবাহিতদের জন্য এই রোজা খুবই জরুরি। অনাহারে থাকার ফলে মানুষের মধ্যে এক ধরনের ডিসিপ্লিন ও ধৈর্য-নিয়ন্ত্রণ শক্তি সৃষ্টি হয়। অবিবাহিতদেরকে এই রোজা রাখার জোর তাগিদ দেয়ার কারণ হলো এতে জৈবিক চাহিদার ভারসাম্যতা রক্ষা হয়। বর্তমান অমুসলিমরাও বৈষয়িক উপকারিতা দেখে রোজা রাখার চেষ্টা করছে। আমি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের শতাধিক সুন্নাত এমন পেয়েছি, যেগুলোকে আধুনিক বিজ্ঞানও স্বীকৃতি দিয়েছে।");

        // list3
        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("খানা খাওয়ার ক্ষেত্রেও প্রিয় নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের অপূর্ব অপূর্ব সুন্নত রয়েছে। প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম যখন খানা খেতেন, পেট ভরে খেতেন না। পেটের একটি অংশ খালি রাখতেন। অর্থাৎ এ পরিমাণ খানা খেতেন না, যার কারণে ঢেকুর ওঠে। দ্বিতীয়ত ক্ষুধা থাকা অবস্থাতেই আহার গ্রহণ করা থেকে বিরত থাকতেন।\n" +
                "\n" +
                "আধুনিক বিজ্ঞান বলে, একটা খেজুরে এ পরিমাণ ক্যালোরি রয়েছে যে, কেউ একটা খেজুর খেলে তিনদিন পর্যন্ত মারা যাবে না। আমরা যে খাবার গ্রহণ করি এর ১০% আমাদের শরীরের অংশে পরিণত হয়। আর বাকি ৯০% আমরা ভেঙ্গে বের করে দেই। এর অর্থ আমরা অভ্যাসবশত আহার করলেও আমাদের শরীর তা গ্রহণ করছে না। ভেঙ্গে বের করে দিচ্ছে। পুরো খাবারের এক দশমাংশ আমাদের শরীরের অংশ হচ্ছে। উপরন্তু পেট ভরে আহার করার কারণে আমরা নানা রকম ব্যাধিতে আক্রান্ত হই। কখনো পেটের পীড়া। কখনো গ্যাস্টিকের যন্ত্রণা। লেগেই আছে কোনো না কোনো ব্যাধি। খাবার গ্রহণের ক্ষেত্রে প্রিয় নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের নিয়ম ছিল, তিনি কখনো পেট ভরে খানা খেতেন না। পেট খানিকটা খালি রাখতেন।\n" +
                "\n" +
                "দ্বিতীয়ত, প্রিয় নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কখনো দুই রকমের খাবার এক সঙ্গে মিলিয়ে খেতেন না। আমরা তো একই সময় চার-পাঁচ  রকমের খাবার এক সঙ্গে খাই। আমরা যে পরিমাণ তৈলাক্ত খাবার রান্না করি, সেগুলো কোনো একটি পাত্রে অল্প অল্প করে নিয়ে এক সঙ্গে মিশালে কেমন দেখা যাবে। নিশ্চিত তা কারো রুচি হবে না।");

        // list4
        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের পান করার সুন্নত কি?\n" +
                "নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম আলাদাভাবে খাবার খেতেন, আলাদাভাবে পানি পান করতেন। কখনো এক সঙ্গে খেতেন না। আধুনিক বিজ্ঞানও বলে, খাবার ও পানি এক সঙ্গে পান করলে শরীরে এক রকম প্রভাব ফেলে, আর ভিন্ন ভিন্নভাবে পান করলে আরেক রকম প্রভাব পেলে। এতে সহজেই অনুমান করা যায়, নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের শুধু পানাহারের সুন্নতগুলোই কত অপূর্ব! কত উপকারী!");


        // list5
        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম সিরকা পান করতেন। বর্তমান আধুনিক বিজ্ঞান বলে, সিরকা মানুষের হজম শক্তি বৃদ্ধি করে। ভেবে দেখুন, একেকটি সুন্নতে কী পরিমাণ ফায়দা।");


        // list6
        List<String> nestedList6 = new ArrayList<>();
        nestedList6.add("প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম যখন খাবার খেতেন, উত্তমরূপে চিবিয়ে চিবিয়ে খেতেন। আমরা সাধারণত এক লোকমা খাবার চার পাঁচবার চিবিয়েই খেয়ে নেই। কিন্তু খাবার বেশি চিবানো হলে তা পাকস্থলীতে চাপ কম ফেলে। আর এটা তো সহজেই বোঝা যায় যে, ভালোভাবে চিবালে পাকস্থলীতে চাপ কম পড়বে। তাই খাবার খুব ভালোভাবে চিবানো উচিৎ।\n" +
                "\n" +
                "যারা খাবার কম চিবায়, তাদের দাঁত সাধারণত বেশি নষ্ট হয়। এর কারণ হলো দাঁতের এক্সারসাইজের প্রয়োজন রয়েছে। কেউ এক পাশের দাঁত দিয়ে খাবারে অভ্যস্ত হলে অন্য পাশের দাঁত নষ্ট হয়ে যায়। এ জন্য ডাক্তাররা বলেন, সব সময় এক পাশের দাঁত দিয়ে খাবার না খাওয়া। উভয় পাশের দাঁত দিয়ে চিবিয়ে খাওয়া। এতে সব দাঁতেরই অনুশীলন হয়।\n" +
                "\n" +
                "প্রিয়! ভেবে দেখুন, একেকটি সুন্নত অনুযায়ী আমল করলে কত ফায়দা। আমরা কল্পনা করেও শেষ করতে পারবো না।");

        // list7
        List<String> nestedList7 = new ArrayList<>();
        nestedList7.add("প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম ডানদিকে কাত হয়ে ঘুমাতেন। আধুনিক বিজ্ঞান বলে, বাম দিকে কাত হয়ে ঘুমালে ঘুম খুব বেশি গভীর হয় এবং দুঃস্বপ্ন দেখে। আর ডান দিকে কাত হয়ে ঘুমালে ঘুম গভীরও হয়, তৃপ্তিকরও হয়। এতে দ্রুত ঘুম পুরা হয় এবং মেজাজ স্ফূর্ত থাকে।");


        // list8
        List<String> nestedList8 = new ArrayList<>();
        nestedList8.add("এ সম্পর্কে নতুন একটি গবেষণা দেখলাম। বাম দিকে কাত হয়ে ঘুমালে দুঃস্বপ্ন বেশি দেখে কেন? এর প্রমাণ হিসেবে উল্লেখ করা হয়েছে, হার্ট বাম দিকে থাকে। বাম দিকে কাত হয়ে ঘুমালে মানুষের কিছু কিছু অন্ত্র হার্টের ওপর পরে এবং হার্টের ওপর প্রেসার সৃষ্টি করে। আর এই প্রেসারের কারণে মানুষ দুঃস্বপ্ন দেখে। এজন্য প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম ডান দিকে কাত হয়ে ঘুমাতেন। আমাদেরকেও ডান কাতে ঘুমাতে বলেছেন।");

        // list9
        List<String> nestedList9 = new ArrayList<>();
        nestedList9.add("নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম সকালে ঘুম থেকে উঠে ওজু করতেন। বর্তমান আধুনিক বিজ্ঞান বলে, চোখের ছানির কার্যকরী ওষুধ হলো সকাল সকাল চোখের ভেতর পানির ঝাপটা মারা। যে ব্যক্তি তাহাজ্জুদের সময় উঠবে, ওজু করবে, সে তো তার চোখে উত্তমরূপে পানির ঝাপটা মারবে। এভাবে তার চোখের ছানির ওষুধ সেবন করা হয়ে যায়। ফলে তার চোখের ছানি পড়বে না। সুবহানাল্লাহ!");


        // list10
        List<String> nestedList10 = new ArrayList<>();
        nestedList10.add("নামাজে সেজদা করার কারণে মুখের সমস্ত শিরা-উপশিরায় রক্ত প্রবাহিত হয়। এজন্য যারা নামাজ পড়ে, তাদের চেহারার মধ্যে তরতাজা ভাব বিদ্যমান থাকে। আর যারা নামাজ পড়ে না, তাদের চেহারার বিষণ্নতা থাকে। এজন্য হাদিস শরিফে বর্ণিত আছে, যে ব্যক্তি নামাজ পড়ে তার চেহারায় নূর থাকে।");

        // list11
        List<String> nestedList11 = new ArrayList<>();
        nestedList11.add("সেই ডাক্তার বললেন, বিশ্বাস করুন, নামাজে দীর্ঘ সময় সিজদা করলে চেহারা কী পরিমাণ তরতাজা থাকে এবং সৌন্দর্য বৃদ্ধি পায়, তা যদি নারীরা জানত, তাহলে তারা সিজদা থেকে মাথাই তুলত না। সবসময় সিজদায় পড়ে থাকত।");

        // list12
        List<String> nestedList12 = new ArrayList<>();
        nestedList12.add("বর্তমানে বৈজ্ঞানিক গবেষণা বলে, মানুষ কোনো জিনিস খাওয়ামাত্র মুখের ভেতর প্লাজিমা সৃষ্টি হয়। এই প্লাজিমা শুধু কুলি করার দ্বারাই দূর হয় না, মেসওয়াক বা ব্রাশ করতে হয়। ঘুমন্ত অবস্থায় দাঁত খুব বেশি নষ্ট হয়। এর কারণ হলো, মানুষ ঘুমালে মুখ একদম বন্ধ হয়ে থাকে। ফলে বন্ধ মুখে জীবাণুর ধ্বংসযজ্ঞ চালানো সহজ হয়। দিনের বেলায় তো মানুষ কখনো কথা বলে, কখনো খানা খায়, কখনো পানীয় পান করে। দিনে মুখ নানা কাজে ব্যস্ত থাকার কারণে প্লাজিমা কাজ করার সুযোগ পায় না। রাতে মুখ এসব কাজ থেকে বিরত থাকলে সে ব্যাপক সুযোগ পেয়ে যায়। এজন্য রাতের বেলায় দাঁত বেশি নষ্ট হয়। তাই সকালে টুথপেস্ট ব্যবহার করুন বা না করুন, রাতে অবশ্যই করবেন।");

        // list13
        List<String> nestedList13 = new ArrayList<>();
        nestedList13.add("আলহামদুলিল্লাহ! আমাদের প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের সুন্নত হলো, তিনি রাতে ঘুমানোর সময় ওজুর সঙ্গে ঘুমাতেন। আর ওজু যখন করতেন, মেসওয়াকও করতেন। মানুষ যখনই খাবার খাবে এবং খাবার খেয়ে ওজু করবে, মেসওয়াক করবে। আলহামদুলিল্লাহ! এতে সে মুখের জীবাণু থেকে অবশ্যই নিরাপদ থাকবে।\n" +
                "\n" +
                "আহার করার ক্ষেত্রে প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের আরো সুন্নত হলো, তিনি আহার করার পূর্বে দুই হাত ধুয়ে নিতেন। আহারান্তে কুলি করতেন। বর্তমানে অনেকে খাবার খেয়ে কুলি না করেই ওঠে। এতে তার মুখের ভেতর দীর্ঘ সময় মিষ্টতা থাকে। এতে মুখের ক্ষতি হয়। এ জন্য আহারান্তে কুলি করুন। এতে অফুরন্ত উপকার রয়েছে। এছাড়াও দৈনিক পাঁচ ওয়াক্ত ওজু তো করবেনই। এতেও মুখ পরিষ্কার থাকবে।");

        // list14
        List<String> nestedList14 = new ArrayList<>();
        nestedList14.add("তাবলিগ জামাতের এক বন্ধু ফ্রান্সে গিয়েছিলেন। তিনি বললেন, আমি সেখানে গিয়ে ওজু করছিলাম। এক ব্যক্তি দাঁড়িয়ে দাঁড়িয়ে আমার ওজু করা দেখছিল। আমি ওজু শেষ করার পর সে আমাকে ডেকে জিজ্ঞাসা করলো, আপনি কে?\n" +
                "আমি বললাম, আমি মুসলমান। \n" +
                "এরপর সে বললো, আপনি এই কিছুক্ষণ পূর্বে কি করলেন?\n" +
                "ওজু করলাম। আমি উত্তর দিলাম।\n" +
                "আপনি কি প্রতিদিনই ওজু করেন?\n" +
                "প্রতিদিন পাঁচবার করি।\n" +
                "সে বললো, ওহ আমি দেখতে পাচ্ছি। \n" +
                "আমি তাকে বললাম, আপনি এসব জিজ্ঞাসা করছেন কেন?\n" +
                "উত্তরে তিনি বললেন, আমি এখানকার মেন্টাল হসপিটালের সার্জন। মানুষ পাগল হয় কেন? এ বিষয়টি নিয়ে আমি গবেষণা করছি। আমার গবেষণা হলো, মানুষের মস্তিষ্কের কাজ করে। মস্তিষ্ক হতে কিছু অতি সূক্ষ্ণ শিরা আমাদের ঘাড়ের পিঠ হয়ে পুরো শরীরে ছড়িয়ে পড়েছে। আমি রিসার্চ করেছি যে, চুল বেশি বড় রাখলে এবং ঘাড়ের পেছনের অংশ শুকনো থাকলে অনেক সময় এই শিরাগুলো শুকিয়ে যায়। এর ফলে মানুষের মস্তিষ্ক কাজ করে না। এজন্য ডাক্তাররা সিন্ধান্ত নিয়েছে যে, ঘাড়ের এই অংশ প্রতিদিন চারবার ভিজিয়ে রাখতে হবে। আমি আপনাকে দেখলাম, আপনি হাত মুখ তো ধৌত করলেনই, সঙ্গে ঘাড়ের পিঠেও ভেজা হাত দ্বারা স্পর্শ করলেন। আমার ধারণা এজন্য মুসলমানরা তেমন পাগল হয় না।\n" +
                "দেখুন, একজন ডাক্তারের সারা জীবনের রিসার্চ একটি মুস্তাহাব পর্যন্ত এসে শেষ হয়ে গেছে। একটি মুস্তাহাবের হেকমত যদি হয় এই, তাহলে ফরজ, ওয়াজিব ও সুন্নতসমূহের হেকমত কত হবে তা বলাই বাহুল্য।");

        // list15
        List<String> nestedList15 = new ArrayList<>();
        nestedList15.add("একবার আমার একটি মিটিং চলছিল। সেখানে আমেরিকান কোম্পানির তিনজন ডিরেক্টর ও জেনারেল ম্যানেজার ছিল। আমি একটি টেবিলে বসে খানা খাচ্ছিলাম। আমি দেখলাম, আমেরিকান সেই ভদ্রলোকেরা ছুরি-চামচ রেখে হাত দিয়ে খানা খাচ্ছে। আমি আশ্চর্য হলাম। আমি তাদেরকে জিজ্ঞাসা করলাম, আপনারা ছুরি-চামচ রেখে হাত দিয়ে খাবার খাচ্ছেন কেন?\n" +
                "উত্তরে তারা বললো, হাতে খাবার খাওয়াই আমাদের পছন্দ।\n" +
                "এই প্রথম সাদা আমরিকানদের হাতে খাবার গ্রহণ করতে দেখলাম। খাবার শেষে তারা আঙুলও চেটে পরিষ্কার করে খেল। \n" +
                "আমি তাদেরকে জিজ্ঞাসা করলাম, কেন আপনি এটি করলেন? \n" +
                "তারা বললো, নতুন গবেষণা হলো, মানুষ হাতে খাবার গ্রহণ করলে লোমকূপ থেকে প্লাজিমা বের হয়ে যায়। যা মাইক্রোস্কোপে দেখা যায়। এই প্লাজিমা খাবারের সঙ্গে মানুষের মুখে চলে যায় এবং হজমের সময় উপকার দেয়। তারা বললো, এজন্য আমরা ছুরি-চামচ রেখে হাতে খাবার গ্রহণ করাকে পছন্দ করি।\n" +
                "\n" +
                "পৃথিবী যতই উন্নত হোক না কেন, এক সময় না এক সময় তাকে আমার প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের দুয়ারে ফিরে আসতেই হবে। আমাদের পরম সৌভাগ্য, আল্লাহ তায়ালা আমাদেরকে মুসলমান বানিয়েছেন এবং প্রিয় নবীজি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামের সুন্নত অনুযায়ী আমল করার তাওফিক দান করেছেন। আল্লাহ তায়ালা আমাদের সবাইকে আমাদের গোটা জীবনকে সুন্নত অনুযায়ী পরিচালনা করার এবং ক্রমাগত সম্মুখে অগ্রসর হওয়ার তাওফিক দান করুন। আমিন। ");


        mList.add(new DataModel(nestedList1, "সুন্নত ও বিজ্ঞানের মতপার্থক্যের মৌলিক কারণ"));
        mList.add(new DataModel(nestedList2, "এক আমেরিকান অমুসলিমের ঘটনা"));
        mList.add(new DataModel(nestedList3, "খাওয়ার সুন্নাত ও আধুনিক বিজ্ঞান"));
        mList.add(new DataModel(nestedList4, "পান করার সুন্নত ও আধুনিক বিজ্ঞান"));
        mList.add(new DataModel(nestedList5, "সিরকা ও আধুনিক বিজ্ঞান"));
        mList.add(new DataModel(nestedList6, "খাবার বেশি বেশি চিবানো ও আধুনিক বিজ্ঞান"));
        mList.add(new DataModel(nestedList7, "ঘুমানোর সুন্নত ও আধুনিক বিজ্ঞান"));
        mList.add(new DataModel(nestedList8, "দুঃস্বপ্ন দেখার কারণ"));
        mList.add(new DataModel(nestedList9, "ওজুর হেকমত ও চোখের ছানির ওষুধ"));
        mList.add(new DataModel(nestedList10, "স্থায়ী সৌন্দর্যের রহস্য"));
        mList.add(new DataModel(nestedList11, "নারীদেরকে নামাজ পড়ার পরামর্শ"));
        mList.add(new DataModel(nestedList12, "মেসওয়াকের সুন্নত"));
        mList.add(new DataModel(nestedList13, "সুন্নত ও দাঁত"));
        mList.add(new DataModel(nestedList14, "ফ্রান্সের এক সার্জনের ঘটনা"));
        mList.add(new DataModel(nestedList15, "সুন্নতের উপকারিতা"));

        adapter = new ItemAdapter(mList);
        mainRecyclerView.setAdapter(adapter);

    }
}