package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public static double get_distance(Geo loc1, Geo loc2) {
		double raio_terra = 6371; // km

		double pow_sin_lat = (Math.asin(Math.toRadians((loc1.latitude - loc2.latitude) / 2))
				* (Math.asin(Math.toRadians((loc1.latitude - loc2.latitude) / 2))));
		double pow_sin_long = (Math.asin(Math.toRadians((loc1.longitude - loc2.longitude) / 2))
				* (Math.asin((loc1.longitude - loc2.longitude) / 2)));
		double distance = 2 * raio_terra * Math.asin(Math.toRadians(
				Math.sqrt(pow_sin_lat + pow_sin_long * Math.cos(Math.toRadians(loc1.longitude))
						* Math.cos(Math.toRadians(loc2.longitude)))));

		return distance;
	}
}
