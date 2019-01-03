package com.main.service;

import java.util.ArrayList;
import java.util.List;

import com.main.beans.Products;

public class ProductService {
	
	public List<Products> getAllProducts() {
		List<Products> prodList = new ArrayList<Products>();
		Products p = new Products();
		p.setName("FREDERIQUE CONSTANT");
		p.setProductNo(1);
		p.setDescription("Classics Business Timer");
		p.setPrice("₹ 66,900");
		p.setImageUrl("https://ethos-cdn1.ethoswatches.com/pub/media/catalog/product/cache/c9e0b0ef589f3508e5ba515cde53c5ff/f/r/frederique-constant-persuasion-fc-270m4p6.jpg");
		prodList.add(p);
		
		p = new Products();
		p.setName("Baume & Mercier");
		p.setProductNo(2);
		p.setDescription("Clifton Baumatic");
		p.setPrice("₹ 2,20,000");
		p.setImageUrl("https://ethos-cdn1.ethoswatches.com/pub/media/catalog/product/cache/c9e0b0ef589f3508e5ba515cde53c5ff/b/a/baume-mercier-clifton-moa10436-multiple-3.jpg");
		prodList.add(p);
		
		p = new Products();
		p.setName("Junghans");
		p.setProductNo(3);
		p.setDescription("Meister Driver Chronoscope");
		p.setPrice("₹ 1,85,900");
		p.setImageUrl("https://ethos-cdn1.ethoswatches.com/pub/media/catalog/product/cache/c9e0b0ef589f3508e5ba515cde53c5ff/j/u/junghans-meister-driver-27368400.jpg");
		prodList.add(p);
		
		p = new Products();
		p.setName("Raymond Weil");
		p.setProductNo(4);
		p.setDescription("Freelancer");
		p.setPrice("₹ 1,86,780");
		p.setImageUrl("https://ethos-cdn1.ethoswatches.com/pub/media/catalog/product/cache/c9e0b0ef589f3508e5ba515cde53c5ff/r/a/raymond-weil-freelancer-2780-stc-acdc1.jpg");
		prodList.add(p);

		p = new Products();
		p.setName("Meistersinger");
		p.setProductNo(5);
		p.setDescription("Cross Line");
		p.setPrice("₹ 1,80,400");
		p.setImageUrl("https://ethos-cdn1.ethoswatches.com/pub/media/catalog/product/cache/2b16c9d007ed412011948f94360a9735/m/e/meistersinger-cross-line-black-line-am1002bl-hover.jpg");
		prodList.add(p);
		
		p = new Products();
		p.setName("FREDERIQUE CONSTANT");
		p.setProductNo(6);
		p.setDescription("Classics Junior");
		p.setPrice("₹ 55,600");
		p.setImageUrl("https://ethos-cdn1.ethoswatches.com/pub/media/catalog/product/cache/c9e0b0ef589f3508e5ba515cde53c5ff/f/c/fc-292sb4b26_.jpg");
		prodList.add(p);
		
		
		
	    return prodList;
	}

}
