package utill.musicutil;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:酷狗歌曲处理类
 * @date 2018-06-019:51
 */
public class KugouUtil {


    public static void main(String[] args) {
        String string="jQuery1124020599535209711517_1527817001925({\"status\":1,\"error_code\":0,\"data\":{\"page\":5,\"tab\":\"全部\",\"lists\":[{\"SongName\":\"如果真的有来生 (伴奏)\",\"OwnerCount\":3,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":25815044,\"ResFileSize\":0,\"Duration\":209,\"MvTrac\":0,\"SQDuration\":209,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":20710846,\"OriSongName\":\"如果真的有来生\",\"FailProcess\":0,\"SQBitrate\":987,\"HQBitrate\":320,\"Audioid\":20710846,\"HiFiQuality\":2,\"Grp\":{},\"OriOtherName\":\"伴奏\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":860580,\"AlbumName\":\"如果真的有来生\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"DD65F66C26A52316CD10BC5624192119\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":1,\"SingerId\":[282439],\"A320Privilege\":0,\"ID\":\"33032475\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"0F5B26616CAFD0E1785DADE03A80D7DB\",\"AlbumID\":\"1058322\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"33032475\",\"ResFileHash\":\"\",\"FileSize\":3346883,\"SuperExtName\":\"\",\"HQFileHash\":\"CD36E98BA42D3928E369DACBC92C5BB4\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"星月组合 - 如果真的有来生 (伴奏)\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":8366677,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":3,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"星月组合\",\"SQExtName\":\"flac\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":209,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":1,\"OldCpy\":1},{\"SongName\":\"恋采莲\",\"OwnerCount\":3,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":0,\"ResFileSize\":0,\"Duration\":269,\"MvTrac\":0,\"SQDuration\":0,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":21159906,\"OriSongName\":\"恋采莲\",\"FailProcess\":0,\"SQBitrate\":0,\"HQBitrate\":320,\"Audioid\":21159906,\"HiFiQuality\":1,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":1104386,\"AlbumName\":\"如果来生有缘\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"6603E81ECCC1102416B1343C76C01671\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[87763],\"A320Privilege\":0,\"ID\":\"38167487\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"00000000000000000000000000000000\",\"AlbumID\":\"1589992\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"38167487\",\"ResFileHash\":\"\",\"FileSize\":4309576,\"SuperExtName\":\"\",\"HQFileHash\":\"C1A1DC752A3644C9D777F060CA25AF04\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"枫桥 - 恋采莲\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":10771853,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":2,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"枫桥\",\"SQExtName\":\"\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":269,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":1,\"OldCpy\":1},{\"SongName\":\"难忘这一年\",\"OwnerCount\":3,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":0,\"ResFileSize\":0,\"Duration\":281,\"MvTrac\":0,\"SQDuration\":0,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":21180390,\"OriSongName\":\"难忘这一年\",\"FailProcess\":0,\"SQBitrate\":0,\"HQBitrate\":320,\"Audioid\":21180390,\"HiFiQuality\":1,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":1147999,\"AlbumName\":\"如果来生有缘\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"486E561595ADFCF665E42E094C4DD162\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[87763],\"A320Privilege\":0,\"ID\":\"38167480\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"00000000000000000000000000000000\",\"AlbumID\":\"1589992\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"38167480\",\"ResFileHash\":\"\",\"FileSize\":4491388,\"SuperExtName\":\"\",\"HQFileHash\":\"ED73C87FB8678B02EE1E79E2C33807BD\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"枫桥 - 难忘这一年\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":11226384,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":2,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"枫桥\",\"SQExtName\":\"\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":281,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":0,\"OldCpy\":1},{\"SongName\":\"想你\",\"OwnerCount\":1,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":0,\"ResFileSize\":0,\"Duration\":265,\"MvTrac\":0,\"SQDuration\":0,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":21180402,\"OriSongName\":\"想你\",\"FailProcess\":0,\"SQBitrate\":0,\"HQBitrate\":320,\"Audioid\":21180402,\"HiFiQuality\":1,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":1080623,\"AlbumName\":\"如果来生有缘\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"6D02A6F27F1617F2092CA488D0288134\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[87763],\"A320Privilege\":0,\"ID\":\"38167478\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"00000000000000000000000000000000\",\"AlbumID\":\"1589992\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"38167478\",\"ResFileHash\":\"\",\"FileSize\":4236433,\"SuperExtName\":\"\",\"HQFileHash\":\"15E58F84ACF6073807A10643AF9026D2\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"枫桥 - 想你\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":10588996,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":2,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"枫桥\",\"SQExtName\":\"\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":265,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":0,\"OldCpy\":1},{\"SongName\":\"如果来生没有你\",\"OwnerCount\":1,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":30643875,\"ResFileSize\":0,\"Duration\":256,\"MvTrac\":0,\"SQDuration\":255,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":24237790,\"OriSongName\":\"如果来生没有你\",\"FailProcess\":0,\"SQBitrate\":959,\"HQBitrate\":320,\"Audioid\":24237790,\"HiFiQuality\":2,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":1049626,\"AlbumName\":\"如果来生没有你\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"B143A051BD2ECACAEA0F26AB7F99B7CC\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[281254],\"A320Privilege\":0,\"ID\":\"53076604\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"BC34D1D0E557C0E34555544C04868847\",\"AlbumID\":\"1945299\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"53076604\",\"ResFileHash\":\"\",\"FileSize\":4096057,\"SuperExtName\":\"\",\"HQFileHash\":\"9496AA0A19A2A82D4AC2E1D05D930082\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"秦博 - 如果来生没有你\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":10219908,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":3,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"秦博\",\"SQExtName\":\"flac\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":255,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":1,\"OldCpy\":1},{\"SongName\":\"盼归郎\",\"OwnerCount\":0,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":0,\"ResFileSize\":0,\"Duration\":242,\"MvTrac\":0,\"SQDuration\":0,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":21159940,\"OriSongName\":\"盼归郎\",\"FailProcess\":0,\"SQBitrate\":0,\"HQBitrate\":320,\"Audioid\":21159940,\"HiFiQuality\":1,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":967611,\"AlbumName\":\"如果来生有缘\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"E20689443B8CC0ED365D50B09F706241\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[87763],\"A320Privilege\":0,\"ID\":\"38167484\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"00000000000000000000000000000000\",\"AlbumID\":\"1589992\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"38167484\",\"ResFileHash\":\"\",\"FileSize\":3865285,\"SuperExtName\":\"\",\"HQFileHash\":\"684304755B1345BC9D86F45E496ECE24\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"枫桥 - 盼归郎\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":9661127,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":2,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"枫桥\",\"SQExtName\":\"\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":242,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":0,\"OldCpy\":1},{\"SongName\":\"爱的熬煎\",\"OwnerCount\":0,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":26688531,\"ResFileSize\":0,\"Duration\":261,\"MvTrac\":0,\"SQDuration\":261,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":21180382,\"OriSongName\":\"爱的熬煎\",\"FailProcess\":0,\"SQBitrate\":818,\"HQBitrate\":320,\"Audioid\":21180382,\"HiFiQuality\":2,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":1062284,\"AlbumName\":\"如果来生有缘\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"58D324FB6BD9B9D60E0309B0FB396B57\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[87763],\"A320Privilege\":0,\"ID\":\"38167483\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"A9C83BAF39441DF7FC321C839E306FA0\",\"AlbumID\":\"1589992\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"38167483\",\"ResFileHash\":\"\",\"FileSize\":4174575,\"SuperExtName\":\"\",\"HQFileHash\":\"3418A9EBF91B6437E055C275E295462B\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"枫桥 - 爱的熬煎\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":10434351,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":3,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"枫桥\",\"SQExtName\":\"flac\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":261,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":0,\"OldCpy\":1},{\"SongName\":\"最真的情鉴\",\"OwnerCount\":0,\"MvType\":0,\"TopicRemark\":\"\",\"SQFailProcess\":0,\"Source\":\"\",\"Bitrate\":128,\"HQExtName\":\"mp3\",\"SQFileSize\":0,\"ResFileSize\":0,\"Duration\":297,\"MvTrac\":0,\"SQDuration\":0,\"ExtName\":\"mp3\",\"Auxiliary\":\"\",\"SongLabel\":\"\",\"Scid\":21180406,\"OriSongName\":\"最真的情鉴\",\"FailProcess\":0,\"SQBitrate\":0,\"HQBitrate\":320,\"Audioid\":21180406,\"HiFiQuality\":1,\"Grp\":{},\"OriOtherName\":\"\",\"AlbumPrivilege\":0,\"TopicUrl\":\"\",\"SuperFileHash\":\"\",\"ASQPrivilege\":0,\"M4aSize\":1210536,\"AlbumName\":\"如果来生有缘\",\"IsOriginal\":0,\"Privilege\":0,\"ResBitrate\":0,\"FileHash\":\"520E9E1CC17B56CF6A4C8A6931CE5467\",\"SQPayType\":0,\"HQPrice\":0,\"Type\":\"audio\",\"SourceID\":0,\"FoldType\":0,\"SingerId\":[87763],\"A320Privilege\":0,\"ID\":\"38167481\",\"SuperFileSize\":0,\"SQPrivilege\":0,\"SQFileHash\":\"00000000000000000000000000000000\",\"AlbumID\":\"1589992\",\"HQPrivilege\":0,\"SuperBitrate\":0,\"SuperDuration\":0,\"MixSongID\":\"38167481\",\"ResFileHash\":\"\",\"FileSize\":4745507,\"SuperExtName\":\"\",\"HQFileHash\":\"6CB5907552373BC845A5160026801C92\",\"HQPkgPrice\":0,\"AudioCdn\":100,\"FileName\":\"枫桥 - 最真的情鉴\",\"OtherName\":\"\",\"mvTotal\":0,\"PkgPrice\":0,\"HQFileSize\":11861682,\"HQFailProcess\":0,\"Publish\":1,\"QualityLevel\":2,\"SQPrice\":0,\"ResDuration\":0,\"PublishAge\":255,\"Price\":0,\"HQPayType\":0,\"SingerName\":\"枫桥\",\"SQExtName\":\"\",\"MvHash\":\"\",\"SQPkgPrice\":0,\"HQDuration\":297,\"PayType\":0,\"HasAlbum\":1,\"Accompany\":0,\"OldCpy\":1}],\"chinesecount\":0,\"searchfull\":0,\"correctiontype\":0,\"subjecttype\":0,\"aggregation\":[{\"key\":\"DJ\",\"count\":0},{\"key\":\"现场\",\"count\":0},{\"key\":\"广场舞\",\"count\":0},{\"key\":\"伴奏\",\"count\":0},{\"key\":\"铃声\",\"count\":0}],\"allowerr\":0,\"correctionsubject\":\"\",\"correctionforce\":0,\"total\":128,\"istagresult\":0,\"istag\":0,\"correctiontip\":\"\",\"pagesize\":30}})\n";
        //获取总条数
        JSONObject tempResult=cutResult(string);
       // int count=eanalysisCount(tempResult);
        int count=15;

        String str="http://songsearch.kugou.com/song_search_v2?callback=jQuery112407827620938576855_1527734591682&keyword=%E6%99%AE%E9%80%9Adisco&page=1&pagesize="+count+"&userid=-1&clientver=&platform=WebFilter&tag=em&filter=2&iscorrection=1&privilege_filter=0&_=1527734591684%20HTTP/1.1";
        System.out.println(str);
       String musicListUrl = HttpUtil.requestUrl(str);
       JSONObject musicList =cutResult(musicListUrl);
       //获取全部歌曲信息
        List<KugouEntity> kugouEntities = analysisList(musicList);
        List<String> list= ListToUrl(kugouEntities);
        getLysrc(list);

    }

    // 从酷狗获取的数据为字符串，此处需要将字符串转换为json数据
    public  static JSONObject cutResult(String result){
        //截取第一个“{”到最后一个“}”之间的数据
       String res= result.substring(result.indexOf("{"),result.lastIndexOf("}")+1);
       //将数据转换为json格式的数据
       JSONObject json=JSONObject.parseObject(res);
        return json;
    }

    //获取歌曲总条数
    public static int eanalysisCount(JSONObject jsonObject){
        //获取歌曲id,hash
        JSONObject dataElement = (JSONObject)jsonObject.get("data");
        Integer count =(Integer)dataElement.get("total");
        return count;
    }

    //获取List
    public static List<KugouEntity> analysisList(JSONObject jsonObject){
        Map<String,String> map = new HashMap<String, String>();
        List<KugouEntity> result;
        //获取歌曲id,hash
        JSONObject dataElement = (JSONObject)jsonObject.get("data");
        JSONArray jsonArray = dataElement.getJSONArray("lists");
        result = JSON.parseArray(jsonArray.toJSONString(), KugouEntity.class);

        return result;
    }

    //将list转换为歌曲详细信息的url
    public static List<String> ListToUrl(List<KugouEntity> kugouEntities){
        List<String> urlList = new ArrayList();
        String  hash= "http://www.kugou.com/yy/index.php?r=play/getdata&hash=";
        String id= "&album_id=";
        for(int i=0;i<kugouEntities.size();i++){
            String musicUrl=hash+kugouEntities.get(i).getFileHash()+id+kugouEntities.get(i).getAlbumID();
            System.out.println(musicUrl);
            urlList.add(musicUrl);
        }
        return urlList;
    }






    //获取歌词等信息
    public static void getLysrc(List<String> url){
        for (int i = 0;i<url.size();i++){
          String resu= HttpUtil.requestUrl(url.get(i));

            JSONObject json=JSONObject.parseObject(resu);
            JSONObject dataElement = (JSONObject)json.get("data");
            String str=(String)dataElement.get("lyrics");
            System.out.println(str);
        }
    }

}
