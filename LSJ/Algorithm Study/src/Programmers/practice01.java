package Programmers;

public class practice01 {
//���ڼ��ڼ��ڼ�?����
//���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
	public String solution(int n) {

		String answer = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer += "��";
			} else {
				answer += "��";
			}

		}

		return answer;

	}

}
