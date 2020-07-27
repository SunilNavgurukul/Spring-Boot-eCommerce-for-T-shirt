package com.sunil__parcha.Service;

import java.util.Optional;
import java.util.UUID;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.Shopping_cart;
import com.sunil__parcha.Repositories.ShippingRepo;

@Service
public class ShippingService {

	@Autowired
	private ShippingRepo shippingRepo;

	@SuppressWarnings("unchecked")
	public JSONObject generateUniqueId() {
		JSONObject obj = new JSONObject();
		obj.put("category_id", UUID.randomUUID());
		return obj;
	}

	public Shopping_cart AddShopingCard(Shopping_cart shoping) {
		return shippingRepo.save(shoping);
	}

	public Optional<Shopping_cart> findById(int id) {
		return shippingRepo.findById(id);
	}

	public Shopping_cart UpdateShippingById(Shopping_cart shopping_cart, int id) {
		Shopping_cart shopping_cartOne = shippingRepo.findById(id).get();
//		System.out.println(shopping_cartOne.getCart_id());
		shopping_cartOne.setItem_id(id);
		shopping_cartOne.setQuantity(shopping_cart.getQuantity());

		return shippingRepo.save(shopping_cartOne);
	}

	public String DeteleShippingById(int id) {

		shippingRepo.deleteById(id);
		return "Deleted";
	}

	public Optional<Shopping_cart> MoveToCart(int id) {
		return shippingRepo.MoveToCart(id);
	}

	@SuppressWarnings("unchecked")
	public JSONObject TotalAmount(int id) {
		Shopping_cart amount = shippingRepo.TotalAmount(id);
		JSONObject obj = new JSONObject();
		obj.put("amount", amount);
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Shopping_cart> SaveForLater(int id) {
		return shippingRepo.findById(id);
	}

}
