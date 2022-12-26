import com.google.gson.annotations.SerializedName

//获得城市响应数据
data class PlaceResponse(val status: String, val places: List<Place>)

//城市地址
data class Place(val name: String, val location: Location,
                 @SerializedName("formatted_address") val address: String)
//经纬度
data class Location(val lng: String, val lat: String)