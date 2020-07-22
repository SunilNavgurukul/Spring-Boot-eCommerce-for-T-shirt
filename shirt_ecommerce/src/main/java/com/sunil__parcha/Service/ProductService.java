package com.sunil__parcha.Service;

import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.Products;
import com.sunil__parcha.Repositories.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productrepo;

	@SuppressWarnings("unchecked")
	public JSONObject findAll_product(String page, String limit, String description_length) {
		int intPage = 1;
		int intLimit = 20;
		int intDescription_length = 200;
		if (page.length() != 0) {
			intPage = Integer.parseInt(page);
		}
		if (limit.length() != 0) {
			intLimit = Integer.parseInt(limit);
		}
		if (description_length.length() != 0) {
			intDescription_length = Integer.parseInt(description_length);
		}
		JSONArray array = new JSONArray();
		for (Object[] i : productrepo.findAll_product()) {
			if (intDescription_length >= 200) {
				JSONObject obj = new JSONObject();
				obj.put("product_id", i[0]);
				obj.put("name", i[1]);
				obj.put("description", i[2]);
				obj.put("price", i[3]);
				obj.put("discounted_price", i[4]);
				obj.put("thumbnail", i[5]);
				array.add(obj);
			}
		}
		JSONObject jsonData = new JSONObject();
		jsonData.put("count", productrepo.findAll().size());
		jsonData.put("rows", array.subList(intPage, intLimit + 1));
		return jsonData;
	}

	public Optional<Products> findById(int id) {
		return productrepo.findById(id);
	}

	@SuppressWarnings("unchecked")
	public JSONObject findByCatogery(int id, String page, String limit, String description_length) {
		int intPage = 1;
		int intLimit = productrepo.findByCatogery(id).size();
		int intDescription_length = 200;
		if (page != null) {
			intPage = Integer.parseInt(page);
		}
		if (limit != null) {
			intLimit = Integer.parseInt(limit);
		}
		if (description_length != null) {
			intDescription_length = Integer.parseInt(description_length);
		}
		JSONArray array = new JSONArray();
		for (Object[] i : productrepo.findByCatogery(id)) {
			if (intDescription_length >= 200) {
				JSONObject obj = new JSONObject();
				obj.put("product_id", i[0]);
				obj.put("name", i[1]);
				obj.put("description", i[2]);
				obj.put("price", i[3]);
				obj.put("discounted_price", i[4]);
				obj.put("thumbnail", i[5]);
				array.add(obj);
			}
		}
		JSONObject jsonData = new JSONObject();
		jsonData.put("count", productrepo.findByCatogery(id).size());
		jsonData.put("rows", array.subList(intPage, intLimit));
		return jsonData;
	}

	@SuppressWarnings("unchecked")
	public JSONObject findByDepartment(int id, String page, String limit, String description_length) {
		int intPage = 1;
		int intLimit = productrepo.findByDepartment(id).size();
		int intDescription_length = 200;
		if (page != null) {
			intPage = Integer.parseInt(page);
		}
		if (limit != null) {
			intLimit = Integer.parseInt(limit);
		}
		if (description_length != null) {
			intDescription_length = Integer.parseInt(description_length);
		}
		JSONArray array = new JSONArray();
		for (Object[] i : productrepo.findByDepartment(id)) {
			if (intDescription_length >= 200) {
				JSONObject obj = new JSONObject();
				obj.put("product_id", i[0]);
				obj.put("name", i[1]);
				obj.put("description", i[2]);
				obj.put("price", i[3]);
				obj.put("discounted_price", i[4]);
				obj.put("thumbnail", i[5]);
				array.add(obj);
			}
		}

		JSONObject jsonData = new JSONObject();
		jsonData.put("count", productrepo.findByDepartment(id).size());
		jsonData.put("rows", array.subList(intPage, intLimit + 1));
		return jsonData;
	}

	@SuppressWarnings("unchecked")
	public JSONArray findByProductId(int id) {
		JSONArray array = new JSONArray();
		for (Object[] i : productrepo.findByProductId(id)) {
			JSONObject obj = new JSONObject();
			obj.put("product_id", i[0]);
			obj.put("name", i[1]);
			obj.put("description", i[2]);
			obj.put("price", i[3]);
			obj.put("discounted_price", i[4]);
			obj.put("image", i[5]);
			obj.put("image_2", i[6]);
			array.add(obj);
		}
		return array;
	}

}
