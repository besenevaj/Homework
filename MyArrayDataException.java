class MyArrayDataException extends NumberFormatException {
	public String message;
	public MyArrayDataException(int arrayNumber, int number) {
		message = "Ошибка формата данных в ячейке [" + arrayNumber + "][" + number + "]";
	}
}
