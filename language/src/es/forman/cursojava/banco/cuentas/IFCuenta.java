package es.forman.cursojava.banco.cuentas;

public interface IFCuenta {

	public static final int REINTEGRO_NOK = 0;

	public static final int REINTEGRO_CORRIENTE = 1;

	public static final int REINTEGRO_AHORRO = 2;

	public static final int REINTEGRO_CREDITO = 3;

	public static final int INGRESO_NOK = 0;

	public static final int INGRESO_CORRIENTE = 1;

	public static final int INGRESO_AHORRO = 2;

	public static final int INGRESO_AHORRO_RESTO = 4;

	public static final int INGRESO_CREDITO = 3;

	public abstract float getSaldo();

	public abstract void setSaldo(float cantidad);

	/**
	 * Reintegra una determinada cantidad de una cuenta. <br>
	 * Este método es sobreesrito por cada subclase, ya que en cada una el proceso es diferente.
	 * @param cantidad a reintegrar
	 * @param ejecuta si es false, indica que no debe ejecutar el reintegro, sólo debe realizar el chequeo de si es posible o no.
	 * @return Devuelve 0 si no es posible, > 0 si es posible.
	 */
	public abstract int reintegra(float cantidad, boolean ejecuta);

	/**
	 * Devuelve el disponible real en una cuenta, considerando posibles limitaciones.
	 * Por defecto, el disponible coincide con el saldo.
	 * @return
	 */
	public abstract float getDisponible();

	/** 
	 * Este método es final: una cantidad está disponible si supera el máximo disponible.
	 * Lo que la subclase puede hacer es sobreescribir getDisponible() (como hace CuentaCorriente, por ejemplo).
	 * @param dinero Cantidad de dinero que queremos comprobar si está disponible, teniendo en cuenta 
	 * el límite inferior que haya podido establecer el cliente.
	 * @return true si la cantidad de float que le pasamos está disponible
	 */
	public abstract boolean isDisponible(float cantidad);

	public abstract float getTipoInteres();

	public abstract void ingresa(float cantidad);

	public abstract void setNumero(String s);

	public abstract String getNumero();

	public abstract String toString();

}