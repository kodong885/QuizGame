package infrastructure;

import domain.Quiz;
import domain.QuizId;
import utils.Answer;

import java.util.HashMap;

import static domain.QuizId.O;

public class QuizBox {

    HashMap<QuizId, Quiz> quizBox = new HashMap<>();

    public QuizBox() {
        Quiz A = new Quiz(QuizId.A, "달팽이에도 이빨이 있다", Answer.O, 10);
        Quiz B = new Quiz(QuizId.B, "세계에서 제일 처음으로 텔레비전 방송을 시작한 나라는 영국이다.", Answer.O, 10);
        Quiz C = new Quiz(QuizId.C, "말도 잠을 잘 때는 사람과 같이 코를 곤다.", Answer.O, 10);
        Quiz D = new Quiz(QuizId.D, "북두칠성은 시계의 반대방향으로 회전한다.", Answer.O, 10);
        Quiz E = new Quiz(QuizId.E, "게의 다리는 모두 12개이다.", Answer.X, 10); // 10개임
        Quiz F = new Quiz(QuizId.F, "열대 지방에 자라는 나무에는 나이테가 없다.", Answer.O, 10);
        Quiz G = new Quiz(QuizId.G, "늑대는 고양이과에 속한다.", Answer.X, 10); // 늑대는 개과에 속한다.
        Quiz H = new Quiz(QuizId.H, "병아리도 배꼽이 있다.", Answer.O, 10);
        Quiz I = new Quiz(QuizId.I, "인간의 뇌 세포는 재생이 되는 신체 세포이다.", Answer.X, 10); // 인간의 뇌 세포는 재생이 안된다.
        Quiz J = new Quiz(QuizId.J, "우리나라 최초의 대중가요는 1923년부터 불리워진 '희망가'이다.", Answer.X, 10); //1926년 '사의 찬미'
        Quiz K = new Quiz(QuizId.K, "물고기도 기침을 한다.", Answer.O, 10);
        Quiz L = new Quiz(QuizId.L, "사슴뿔은 매년 빠졌다 다시 난다.", Answer.O, 10);
        Quiz M = new Quiz(QuizId.M, "사람의 땀은 산성이다.", Answer.O, 10);
        Quiz N = new Quiz(QuizId.N, "남자와 여자의 목소리 중 멀리 들리는 것은 남자 목소리이다.", Answer.X, 10);
        Quiz O = new Quiz(QuizId.O, "위가 없어도 사람은 살 수 있다.", Answer.O, 10);
        Quiz P = new Quiz(QuizId.P, "원숭이는 지문이 없다.", Answer.X, 10); // 원숭이도 지문이 있다.
        Quiz Q = new Quiz(QuizId.Q, "호적법에 의해서, 사람이 출생한 후, 보름이내에 출생신고를 해야한다.", Answer.X, 10); // 한달 이내
        Quiz R = new Quiz(QuizId.R, "기린의 목뼈는 모두 8개이다.", Answer.X, 10); // 7개이다.
        Quiz S = new Quiz(QuizId.S, "빵은 순수 우리말이 아니다.", Answer.X, 10);
        Quiz T = new Quiz(QuizId.T, "백설공부에 나오는 일곱 난쟁이의 직업은 광부였다.", Answer.O, 10);
        Quiz U = new Quiz(QuizId.U, "버스의 무임 승차 나이는 7세 미만이다.", Answer.X, 10); // 6세 미만
        Quiz V = new Quiz(QuizId.V, "1부터 7까지 곱한 숫자가 1부터 100까지 더한 숫자보다 높다.", Answer.X, 10); // (1부터 7까지 곱한 숫자 ⇒5,040 / 1부터 100까지 더한 숫자⇒5,050)
        Quiz W = new Quiz(QuizId.W, "닭도 왼발잡이, 오른발잡이가 있다.", Answer.O, 10);
        Quiz X = new Quiz(QuizId.X, "색맹도 색깔이 있는 꿈을 꿀 수가 있다.", Answer.X, 10); // 꿈은 경험한 것을 재료로함.
        Quiz Y = new Quiz(QuizId.Y, "개발에도 땀이 난다.", Answer.X, 10); // 개발에는 땀샘이 없다.
        Quiz Z = new Quiz(QuizId.Z, "새는 뒤로도 날 수 있다.", Answer.O, 10);

        quizBox.put(QuizId.A, A);
        quizBox.put(QuizId.B, B);
        quizBox.put(QuizId.C, C);
        quizBox.put(QuizId.D, D);
        quizBox.put(QuizId.E, E);
        quizBox.put(QuizId.F, F);
        quizBox.put(QuizId.G, G);
        quizBox.put(QuizId.H, H);
        quizBox.put(QuizId.I, I);
        quizBox.put(QuizId.J, J);
        quizBox.put(QuizId.K, K);
        quizBox.put(QuizId.L, L);
        quizBox.put(QuizId.M, M);
        quizBox.put(QuizId.N, N);
        quizBox.put(QuizId.O, O);
        quizBox.put(QuizId.P, P);
        quizBox.put(QuizId.Q, Q);
        quizBox.put(QuizId.R, R);
        quizBox.put(QuizId.S, S);
        quizBox.put(QuizId.T, T);
        quizBox.put(QuizId.U, U);
        quizBox.put(QuizId.V, V);
        quizBox.put(QuizId.W, W);
        quizBox.put(QuizId.X, X);
        quizBox.put(QuizId.Y, Y);
        quizBox.put(QuizId.Z, Z);

    }

    public Quiz findQuiz(QuizId id) {
        return quizBox.get(id);
    }

    public void removeSelectedQuiz(QuizId id) {
        quizBox.remove(id);
    }

    public Boolean checkIsQuizEmpty() {
        return quizBox.isEmpty();
        // If quiz box is empty, this method returns true
    }

}
