package com.zsCat.web.goods.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.zsCat.common.json.JsonUtils;

/**
 * 
 * @author lza
 * @date 2015年06月29日14:50:01
 * @discription 此工具类,是用来将goods实体类中的spec,attr等字段,将其字符串序列化成指定的实体类
 */
public class GoodsUtils {

	/**
	 * 将goods实体类中的goodsSpec字段中的字符串值,序列化成map
	 * map结构:
	 * 	外层map的键为规格id(spId),值为内层map
	 * 	内层为GoodsSpecVo形的list
	 * @return Map<Integer, List<GoodsSpecVo>>
	 */
	public static Map<String, List<GoodsSpecVo>> goodsSpecStrToMapList(String goodsSpec){
		if(goodsSpec == null || goodsSpec.trim().equals("")){
			return null;
		}
		//准备返回的map(外层)
		Map<String, List<GoodsSpecVo>> returnMap = new HashMap<String, List<GoodsSpecVo>>();
		HashMap<String, String> map = (HashMap<String, String>) JsonUtils.readJsonToMap(goodsSpec);
		//遍历map
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, String> entrySpec = it.next();
			//得到key
			String spId = entrySpec.getKey();
			//在map中,嵌套了一个map
			HashMap<String, String> valueMap = (HashMap<String, String>) JsonUtils.readJsonToMap(entrySpec.getValue());
			Iterator<Entry<String, String>> valueKeyIt = valueMap.entrySet().iterator();
			//准备内层的list
			List<GoodsSpecVo> list = new ArrayList<GoodsSpecVo>();
				//内层循环
				while(valueKeyIt.hasNext()){
					//准备给GoodsSpecVo实体类
					GoodsSpecVo goodsSpecVo = new GoodsSpecVo();
					Entry<String, String> entry = valueKeyIt.next();
					String spValueId = entry.getKey();
					String spValueName = entry.getValue();
					goodsSpecVo.setSpId(Integer.parseInt(spId));
					goodsSpecVo.setSpValueId(Integer.parseInt(spValueId));
					goodsSpecVo.setSpValueName(spValueName);
					//放入list
					list.add(goodsSpecVo);
				}
				//将内层map 放入外层map
				returnMap.put(spId, list);
		}
		return returnMap;
	}	
	/**
	 * 将goods实体类中的goodsColImg字段中的字符串值,序列化成map
	 * map结构:
	 * 	键为goodsValueId也就是图片对应的规格值id
	 * 	值为对应的用户自定义图片名
	 * @return Map<String, String>
	 */
	public static Map<String, String> goodsColImgStrToMap(String goodsColImg){
		if(goodsColImg == null || goodsColImg.trim().equals("")){
			return null;
		}
		//准备返回的map
		Map<String, String> returnMap = new HashMap<String, String>();
		returnMap = (HashMap<String, String>) JsonUtils.readJsonToMap(goodsColImg);
		return returnMap;
	}
	/**
	 * 将goodsSpec实体类中的specGoodsSpec字段中的字符串值进行提炼获得以逗号分隔的secValueid字符串
	 * @return String
	 */
	public static String getThisGoodsAllSpecValueId(String specGoodsSpec){
		if(specGoodsSpec == null || specGoodsSpec.trim().equals("")){
			return null;
		}
		Map<String, String> map = specGoodsSpecToMap(specGoodsSpec);
		Set<String> set = map.keySet();
		String str = "";
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			str += it.next() + ",";
		}
		str = str.substring(0, str.length() - 1);
		return str;
	}
	/**
	 * 将goodsSpec实体类中的specGoodsSpec字段中的字符串值,序列化成map
	 * map结构:
	 * 	键为goodsValueId也就是图片对应的规格值id
	 * 	值为对应的自定义规格名称
	 * @return Map<String, String>
	 */
	public static Map<String, String> specGoodsSpecToMap(String specGoodsSpec){
		return goodsColImgStrToMap(specGoodsSpec);
	}
	
}
