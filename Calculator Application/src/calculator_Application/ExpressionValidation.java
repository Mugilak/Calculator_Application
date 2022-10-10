package calculator_Application;

public class ExpressionValidation {
	public boolean validate(String expression) {
		char[] exp = expression.toCharArray();
		int length = exp.length;

		for (int i = 0; i < length; i++) {
			if ((exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/' || exp[i] == '^' || exp[i] == '('
					|| exp[i] == '%')
					&& ((i + 1 < length) && (exp[i + 1] == '+' || exp[i + 1] == '-' || exp[i + 1] == '*'
							|| exp[i + 1] == '^' || exp[i + 1] == '/' || exp[i + 1] == '%' || exp[i] == ')'))) {
				return false;
			}
			if (exp[i] == ')' && ((i - 1 >= 0) && (exp[i - 1] == '+' || exp[i - 1] == '-' || exp[i - 1] == '*'
					|| exp[i - 1] == '^' || exp[i - 1] == '/'))) {
				return false;
			}
			if ((exp[i] >= 'a' && exp[i] <= 'z') || (exp[i] >= 'A' && exp[i] <= 'Z') || (exp[i] >= 'U' && exp[i] <= 'Z')
					|| (exp[i] >= 58 && exp[i] <= 63) || (exp[i]) == '!' || (exp[i]) == '"' || (exp[i]) == '#'
					|| (exp[i]) == '&' || (exp[i]) == '@' || (exp[i]) == '~' || (exp[i]) == '`' || (exp[i]) == '|'
					|| (exp[i]) == '$' || (exp[i]) == '_' || (exp[i]) == ',' || (exp[i]) == '\\') {

				if ((i < length - 5) && (expression.substring(i, i + 4) == "sqrt")) {
					return true;
				} else if ((i < length - 3) && (expression.substring(i, i + 2) == "pi")) {

				} else {
					return false;
				}
			} else {
				if (exp[length - 1] == '+' || exp[length - 1] == '-' || exp[length - 1] == '*' || exp[length - 1] == '/'
						|| exp[length - 1] == '^') {
					return false;
				}
				if (exp[0] == '*' || exp[0] == '/' || exp[0] == '^') {
					return false;
				}
			}
		}
		return true;
	}
}
