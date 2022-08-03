package com.triget.application.domain.product.accommodation;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "hotel")
public class AccommodationProduct {

    @Id
    private String _id;
    @Field("bookings_id")
    private String bookingsId;
    private String name;
    private String thumbnail;
    private String subcategory;
    private float longitude;
    private float latitude;
    private String city;
    private String district;
    private String address;
    private int price;
    @Field("currency_code")
    private String currencyCode;
    private float rating;
    private int popularity;
    @Field("detail_url")
    private String detailUrl;

    @Builder
    public AccommodationProduct(String _id, String bookingsId, String name, String thumbnail, String subcategory,
                                float longitude, float latitude, String city, String district, String address,
                                int price, String currencyCode, float rating, int popularity, String detailUrl)
    {
        this._id = _id;
        this.bookingsId = bookingsId;
        this.name = name;
        this.thumbnail = thumbnail;
        this.subcategory = subcategory;
        this.longitude = longitude;
        this.latitude = latitude;
        this.city = city;
        this.district = district;
        this.address = address;
        this.price = price;
        this.currencyCode = currencyCode;
        this.rating = rating;
        this.popularity = popularity;
        this.detailUrl = detailUrl;
    }
}
