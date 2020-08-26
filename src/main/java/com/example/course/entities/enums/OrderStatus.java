package com.example.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//construtor para o tipo enumerado
	private int code;
	
	private OrderStatus(int code)
	{
		this.code = code;
	}
	
	//criando método acessível para classes exteriores
	public int getCode()
	{
		return code;
	}
	
	//convertendo valor numerico para tipo enumerado
	//static porque o método funcionará sem precisar instanciar
	public static OrderStatus valueOf(int code)
	{
		//percorre todos o valores possíveis do tipo enumerado e retorna o codigo
		//correspondente se achado
		for(OrderStatus value: OrderStatus.values())
		{
			if(value.getCode() ==  code)
			{
				return value;
			}
		}
		//se não achar nada lança uma exceção
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
